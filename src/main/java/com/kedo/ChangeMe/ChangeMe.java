package com.kedo.ChangeMe;

/**
 * Main plugin class.
 * 
 * TODO: Implement your plugin logic here.
 * 
 * @author kedo
 * @version 0.0.1
 */
public class ChangeMe {

    private static ChangeMe instance;
    
    /**
     * Constructor - Called when plugin is loaded.
     */
    public ChangeMe() {
        instance = this;
        System.out.println("[ChangeMe] Plugin loaded!");
    }
    
    /**
     * Called when plugin is enabled.
     */
    public void onEnable() {
        System.out.println("[ChangeMe] Plugin enabled!");
        
        // TODO: Initialize your plugin here
        // - Load configuration
        // - Register event listeners
        // - Register commands
        // - Start services
    }
    
    /**
     * Called when plugin is disabled.
     */
    public void onDisable() {
        System.out.println("[ChangeMe] Plugin disabled!");
        
        // TODO: Cleanup your plugin here
        // - Save data
        // - Stop services
        // - Close connections
    }
    
    /**
     * Get plugin instance.
     */
    public static ChangeMe getInstance() {
        return instance;
    }
}
