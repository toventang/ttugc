package com.lynx.tasm;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableMap;

/* renamed from: com.lynx.tasm.q */
public final class C28855q {

    /* renamed from: a */
    public boolean f68101a = true;

    /* renamed from: b */
    public boolean f68102b;

    /* renamed from: c */
    public boolean f68103c;

    /* renamed from: d */
    public String f68104d = "error";

    /* renamed from: e */
    public boolean f68105e;

    /* renamed from: f */
    public String f68106f;

    /* renamed from: g */
    public String f68107g;

    /* renamed from: h */
    public String f68108h;

    /* renamed from: i */
    public boolean f68109i;

    /* renamed from: j */
    public String f68110j;

    /* renamed from: k */
    public String f68111k;

    /* renamed from: l */
    public boolean f68112l;

    /* renamed from: m */
    public String f68113m;

    /* renamed from: n */
    public String f68114n;

    /* renamed from: o */
    public boolean f68115o;

    /* renamed from: p */
    public boolean f68116p;

    /* renamed from: q */
    public boolean f68117q;

    /* renamed from: r */
    public String f68118r;

    static {
        Covode.recordClassIndex(34964);
    }

    public final String toString() {
        return "PageConfig{autoExpose=" + this.f68101a + ", pageVersion='" + this.f68104d + '}';
    }

    public C28855q(ReadableMap readableMap) {
        if (readableMap != null) {
            if (readableMap.hasKey("autoExpose")) {
                this.f68101a = readableMap.getBoolean("autoExpose");
            }
            if (readableMap.hasKey("pageVersion")) {
                this.f68104d = readableMap.getString("pageVersion");
            }
            if (readableMap.hasKey("enableEventThrough")) {
                this.f68102b = readableMap.getBoolean("enableEventThrough");
            }
            if (readableMap.hasKey("defaultOverflowVisible")) {
                this.f68103c = readableMap.getBoolean("defaultOverflowVisible");
            }
            if (readableMap.hasKey("useNewImage")) {
                this.f68105e = readableMap.getBoolean("useNewImage");
            }
            if (readableMap.hasKey("pageType")) {
                this.f68106f = readableMap.getString("pageType");
            }
            if (readableMap.hasKey("cliVersion")) {
                this.f68107g = readableMap.getString("cliVersion");
            }
            if (readableMap.hasKey("customData")) {
                this.f68108h = readableMap.getString("customData");
            }
            if (readableMap.hasKey("useNewSwiper")) {
                this.f68109i = readableMap.getBoolean("useNewSwiper");
            }
            if (readableMap.hasKey("targetSdkVersion")) {
                this.f68110j = readableMap.getString("targetSdkVersion");
            }
            if (readableMap.hasKey("lepusVersion")) {
                this.f68111k = readableMap.getString("lepusVersion");
            }
            if (readableMap.hasKey("enableLepusNG")) {
                this.f68112l = readableMap.getBoolean("enableLepusNG");
            }
            if (readableMap.hasKey("radonMode")) {
                this.f68113m = readableMap.getString("radonMode");
            }
            if (readableMap.hasKey("tapSlop")) {
                this.f68114n = readableMap.getString("tapSlop");
            }
            if (readableMap.hasKey("enableCreateViewAsync")) {
                this.f68115o = readableMap.getBoolean("enableCreateViewAsync");
            }
            if (readableMap.hasKey("enableAccessibilityElement")) {
                this.f68116p = readableMap.getBoolean("enableAccessibilityElement");
            }
            if (readableMap.hasKey("enableNewFlatten")) {
                this.f68117q = readableMap.getBoolean("enableNewFlatten");
            }
            if (readableMap.hasKey("reactVersion")) {
                this.f68118r = readableMap.getString("reactVersion");
            }
        }
    }
}
