package com.bytedance.crash;

import com.bytedance.covode.number.Covode;
import java.util.Map;

public interface AttachUserData {
    static {
        Covode.recordClassIndex(15855);
    }

    Map<? extends String, ? extends String> getUserData(CrashType crashType);
}
