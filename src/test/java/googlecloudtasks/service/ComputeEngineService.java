package googlecloudtasks.service;

import googlecloudtasks.model.ComputeEngine;

public class ComputeEngineService {

    public static ComputeEngine hardcoreTaskFormFill() {
        ComputeEngine computeEngine = new ComputeEngine();
        computeEngine.setNumberOfInstances(4);
        computeEngine.setInstancesReason("");
        computeEngine.setOperationSystemSoftware("Free: Debian, CentOS, CoreOS, Ubuntu, or other User Provided OS");
        computeEngine.setVMClass("Regular");
        computeEngine.setInstanceType("n1-standard-8    (vCPUs: 8, RAM: 30 GB)");
        computeEngine.setGPUNumber(1);
        computeEngine.setGPUType("NVIDIA Tesla V100");
        computeEngine.setLocalSSD("2x375 Gb");
        computeEngine.setLocation("Frankfurt (europe-west3)");
        computeEngine.setCommittedUsage("1 Year");
        return computeEngine;
    }

}
