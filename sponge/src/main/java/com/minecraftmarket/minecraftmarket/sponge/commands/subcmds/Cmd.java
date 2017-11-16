package com.minecraftmarket.minecraftmarket.sponge.commands.subcmds;

import org.spongepowered.api.command.CommandSource;

public abstract class Cmd {
    private final String command;
    private final String description;
    private final String args;

    Cmd(String command, String description) {
        this(command, description, "");
    }

    Cmd(String command, String description, String args) {
        this.command = command;
        this.description = description;
        this.args = args;
    }

    public String getCommand() {
        return command;
    }

    public String getDescription() {
        return description;
    }

    public String getArgs() {
        return args;
    }

    public abstract void run(CommandSource sender, String[] args);
}