package com.nodes.apiservice.repository;

import com.nodes.apiservice.entity.Node;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NodeRepository extends JpaRepository<Node, Long> {
    Node findById(String id);
    List<Node> findByNodeId(String nodeId);
    List<Node> findByNodeName(String nodeName);
    List<Node> findByNodeType(String nodeType);
    List<Node> findByParentNodeGroupName(String parentNodeGroupName);
    List<Node> findByParentNodeGroupId(String parentNodeGroupId);
//    List<Node> findByParentNodeId(String parentNodeId);
}