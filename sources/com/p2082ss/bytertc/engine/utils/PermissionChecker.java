package com.p2082ss.bytertc.engine.utils;

import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.bytertc.base.utils.RtcContextUtils;

/* renamed from: com.ss.bytertc.engine.utils.PermissionChecker */
public class PermissionChecker {
    static {
        Covode.recordClassIndex(101156);
    }

    public static boolean checkAudioPermission() {
        if (C0643b.m2367a(RtcContextUtils.getApplicationContext(), "android.permission.RECORD_AUDIO") == 0) {
            return true;
        }
        return false;
    }

    public static boolean checkCameraPermission() {
        if (C0643b.m2367a(RtcContextUtils.getApplicationContext(), "android.permission.CAMERA") == 0) {
            return true;
        }
        return false;
    }
}
