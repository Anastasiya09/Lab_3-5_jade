package jade.core.vampus.agents;

import jade.core.Agent;

import java.util.List;

/**
@author Boiko Anastasiia
*/

public interface NavigatorListener {
    void navigatorListModelChanged(List<? super Agent> hunters);
}
