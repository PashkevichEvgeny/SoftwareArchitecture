package semA.InMemoryModel;

import semA.ModelElements.Camera;
import semA.ModelElements.Flash;
import semA.ModelElements.PoligonModel;
import semA.ModelElements.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger{
    public List<PoligonModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private IModelChangedObserver[] changedObservers;


    public ModelStore(IModelChangedObserver[] changedObservers) {
        this.changedObservers = changedObservers;
        this.models = new ArrayList<>();
        this.scenes = new ArrayList<>();
        this.flashes = new ArrayList<>();
        this.cameras = new ArrayList<>();
    }

    public Scene getScene(int id){
        return this.scenes.get(id);
    }

    @Override
    public void notifyChange(IModelChanger sender) {
    }
}
