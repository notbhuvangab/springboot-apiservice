package com.nodes.apiservice;

import com.nodes.apiservice.entity.Node;
import com.nodes.apiservice.service.NodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

@RestController
public class NodeController {
    private final NodeService nodeService;

    @Autowired
    public NodeController(NodeService nodeService) {
        this.nodeService = nodeService;
    }

    @PostMapping("/addNode")
    public ResponseEntity<Node> addNode(@Valid @RequestBody Node node) {
        Node addedNode = nodeService.addNode(node);
        return ResponseEntity.status(HttpStatus.CREATED).body(addedNode);
    }

    @GetMapping("/api/nodes")
    public ResponseEntity<List<Node>> getAllNodes() {
        List<Node> nodes = nodeService.getAllNodes();
        return ResponseEntity.ok(nodes);
    }

}