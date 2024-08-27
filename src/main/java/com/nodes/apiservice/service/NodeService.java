package com.nodes.apiservice.service;

import com.nodes.apiservice.entity.Node;
import com.nodes.apiservice.repository.NodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NodeService {
    private final NodeRepository nodeRepository;

    @Autowired
    public NodeService(NodeRepository nodeRepository) {
        this.nodeRepository = nodeRepository;
    }

    public Node addNode(Node node) {
        return nodeRepository.save(node);
    }

    public List<Node> getAllNodes() {
        return nodeRepository.findAll();
    }

    public Node getNodeById(String id){
        return nodeRepository.findById(id);
    }
    public List<Node> getNodesByNodeId(String nodeId) {
        return nodeRepository.findByNodeId(nodeId);
    }

    public List<Node> getNodesByNodeName(String nodeName) {
        return nodeRepository.findByNodeName(nodeName);
    }

    public List<Node> getNodesByNodeType(String nodeType) {
        return nodeRepository.findByNodeType(nodeType);
    }

    public List<Node> getNodesByParentNodeGroupName(String parentNodeGroupName) {
        return nodeRepository.findByParentNodeGroupName(parentNodeGroupName);
    }

    public List<Node> getNodesByParentNodeGroupId(String parentNodeGroupId) {
        return nodeRepository.findByParentNodeGroupId(parentNodeGroupId);
    }

//    public List<Node> getNodesByParentNodeId(String parentNodeId) {
//        return nodeRepository.findByParentNodeId(parentNodeId);
//    }
}