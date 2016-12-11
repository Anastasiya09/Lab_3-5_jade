package jade.core.vampus.agents;

import jade.core.vampus.enviroments.CaveNodes;

/**
@author Boiko Anastasiia
*/


public interface CaveModelListener {
    void CaveModelChanged(CaveNodes[][] caveMap);
}
