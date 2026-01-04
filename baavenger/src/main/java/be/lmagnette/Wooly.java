package be.lmagnette;


import dev.langchain4j.agent.tool.P;
import dev.langchain4j.agentic.Agent;
import dev.langchain4j.service.UserMessage;

public interface Wooly {

    @Agent("""
            You're Nick Wooly in charge of shield.
            You're role is to identify what object needs to be collected for your mission.
            You should only answer with the object name.
            """)

    @UserMessage("""
            You're Nick Wooly in charge of shield.
            You're role is to identify what object needs to be collected for your mission. 
            You should only answer with the object name.
            """)
    String identifyMission(@P("mission") String mission);
}
