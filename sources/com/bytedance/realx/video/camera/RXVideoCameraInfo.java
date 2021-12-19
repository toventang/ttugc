package com.bytedance.realx.video.camera;

import com.bytedance.covode.number.Covode;
import com.bytedance.realx.base.RXLogging;
import java.util.ArrayList;
import org.webrtc.Camera1Enumerator;

public class RXVideoCameraInfo {
    private ArrayList<DeviceInfo> deviceInfos = new ArrayList<>();

    static {
        Covode.recordClassIndex(25645);
    }

    public int getDeviceNumbers() {
        return this.deviceInfos.size();
    }

    RXVideoCameraInfo() {
        RXLogging.m41313i("RXVideoCameraInfo", "RXVideoCameraInfo Created...");
        try {
            Camera1Enumerator camera1Enumerator = new Camera1Enumerator(true, false);
            String[] deviceNames = camera1Enumerator.getDeviceNames();
            for (String str : deviceNames) {
                DeviceInfo deviceInfo = new DeviceInfo();
                deviceInfo.name = str;
                if (camera1Enumerator.isFrontFacing(str)) {
                    deviceInfo.cameraId = 0;
                } else if (camera1Enumerator.isBackFacing(str)) {
                    deviceInfo.cameraId = 1;
                } else {
                    deviceInfo.cameraId = 2;
                }
                this.deviceInfos.add(deviceInfo);
            }
        } catch (IllegalArgumentException e) {
            RXLogging.m41313i("RXVideoCameraInfo", "Create VideoCapture failed : " + e.getMessage());
        }
    }

    public class DeviceInfo {
        int cameraId;
        String name;

        static {
            Covode.recordClassIndex(25646);
        }

        public DeviceInfo() {
        }
    }

    public int getCameraId(int i) {
        if (i >= this.deviceInfos.size()) {
            return 3;
        }
        return this.deviceInfos.get(i).cameraId;
    }

    public String getDeviceName(int i) {
        if (i >= this.deviceInfos.size()) {
            return null;
        }
        return this.deviceInfos.get(i).name;
    }
}
