package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.bytedance.covode.number.Covode;

/* renamed from: com.appsflyer.internal.ag */
public final class C2301ag {

    /* renamed from: ɩ */
    private AbstractC2303a f6975 = new AbstractC2303a() {
        /* class com.appsflyer.internal.C2301ag.C23022 */

        static {
            Covode.recordClassIndex(2554);
        }

        @Override // com.appsflyer.internal.C2301ag.AbstractC2303a
        /* renamed from: ǃ */
        public final Class<?> mo6443(String str) {
            return Class.forName(str);
        }
    };

    /* access modifiers changed from: package-private */
    /* renamed from: com.appsflyer.internal.ag$a */
    public interface AbstractC2303a {
        static {
            Covode.recordClassIndex(2555);
        }

        /* renamed from: ǃ */
        Class<?> mo6443(String str);
    }

    static {
        Covode.recordClassIndex(2553);
    }

    /* renamed from: ı */
    public final String mo6442() {
        EnumC2304c[] values = EnumC2304c.values();
        for (EnumC2304c cVar : values) {
            if (m7064(cVar.f6986)) {
                return cVar.f6985;
            }
        }
        return EnumC2304c.DEFAULT.f6985;
    }

    /* renamed from: com.appsflyer.internal.ag$c */
    enum EnumC2304c {
        UNITY("android_unity", "com.unity3d.player.UnityPlayer"),
        REACT_NATIVE("android_reactNative", "com.facebook.react.ReactApplication"),
        CORDOVA("android_cordova", "org.apache.cordova.CordovaActivity"),
        SEGMENT("android_segment", "com.segment.analytics.integrations.Integration"),
        COCOS2DX("android_cocos2dx", "org.cocos2dx.lib.Cocos2dxActivity"),
        DEFAULT("android_native", "android_native"),
        ADOBE_EX("android_adobe_ex", "com.appsflyer.adobeextension"),
        FLUTTER("android_flutter", "com.appsflyer.appsflyersdk.AppsflyerSdkPlugin");
        

        /* renamed from: І */
        private String f6985;

        /* renamed from: і */
        private String f6986;

        static {
            Covode.recordClassIndex(2556);
        }

        private EnumC2304c(String str, String str2) {
            this.f6985 = str;
            this.f6986 = str2;
        }
    }

    /* renamed from: ı */
    private boolean m7064(String str) {
        try {
            this.f6975.mo6443(str);
            AFLogger.afRDLog(new StringBuilder("Class: ").append(str).append(" is found.").toString());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return false;
        }
    }
}
