package com.nodes.apiservice;

import com.nodes.apiservice.entity.Node;
import com.nodes.apiservice.service.NodeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TestController {


    private final NodeService nodeService;

    @Autowired
    public TestController(NodeService nodeService) {
        this.nodeService = nodeService;
    }

    @GetMapping("/nodes")
    public ResponseEntity<List<Node>> test() {
        List<Node> nodes = nodeService.getAllNodes();

        return ResponseEntity.ok(nodes);
    }

    @PostMapping("/addNode")
    public ResponseEntity<Node> addNode(@Valid @RequestBody Node node) {
        Node addedNode = nodeService.addNode(node);
        return ResponseEntity.status(HttpStatus.CREATED).body(addedNode);
    }

    @GetMapping("/getNodeById/{id}")
    public ResponseEntity<Node> getNodeById(@PathVariable String id) {
        Node node = nodeService.getNodeById(id);
        return ResponseEntity.ok(node);
    }
}

