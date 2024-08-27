package com.nodes.apiservice.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "nodes")
public class Node {

    @Id
    @NotBlank(message = "ID is required")
    @Pattern(regexp = "^[^!@#$%^&*()]*$", message = "Special characters are not allowed")
    private String id;

    @NotBlank(message = "Node ID is required")
    @Pattern(regexp = "^[^!@#$%^&*()]*$", message = "Special characters are not allowed")
    @Column(name = "node_id")
    private String nodeId;

    @NotBlank(message = "Node name is required")
    @Pattern(regexp = "^[^!@#$%^&*()]*$", message = "Special characters are not allowed")
    @Column(name = "node_name")
    private String nodeName;

    @Pattern(regexp = "^[^!@#$%^&*()]*$", message = "Special characters are not allowed")
    private String description;

    @Pattern(regexp = "^[^!@#$%^&*()]*$", message = "Special characters are not allowed")
    private String memo;

    @NotBlank(message = "Node type is required")
    @Pattern(regexp = "^[^!@#$%^&*()]*$", message = "Special characters are not allowed")
    @Column(name = "node_type")
    private String nodeType;

    @NotBlank(message = "Parent node group name is required")
    @Pattern(regexp = "^[^!@#$%^&*()]*$", message = "Special characters are not allowed")
    @Column(name = "parent_node_group_name")
    private String parentNodeGroupName;

    @NotBlank(message = "Parent node group ID is required")
    @Pattern(regexp = "^[^!@#$%^&*()]*$", message = "Special characters are not allowed")
    @Column(name = "parent_node_group_id")
    private String parentNodeGroupId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public String getParentNodeGroupName() {
        return parentNodeGroupName;
    }

    public void setParentNodeGroupName(String parentNodeGroupName) {
        this.parentNodeGroupName = parentNodeGroupName;
    }

    public String getParentNodeGroupId() {
        return parentNodeGroupId;
    }

    public void setParentNodeGroupId(String parentNodeGroupId) {
        this.parentNodeGroupId = parentNodeGroupId;
    }

//    @NotBlank(message = "Parent node ID is required")
//    @Pattern(regexp = "^[^!@#$%^&*()]*$", message = "Special characters are not allowed")
//    @Column(name = "parent_node_id")
//    private String parentNodeId;

    // Getters and setters
}