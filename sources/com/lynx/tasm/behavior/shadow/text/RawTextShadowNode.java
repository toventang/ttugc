package com.lynx.tasm.behavior.shadow.text;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.lynx.react.bridge.AbstractC28367a;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.behavior.AbstractC28525m;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import java.text.DecimalFormat;

public class RawTextShadowNode extends ShadowNode {

    /* renamed from: a */
    public String f67171a;

    /* renamed from: b */
    public boolean f67172b;

    static {
        Covode.recordClassIndex(34561);
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    /* renamed from: a */
    public final boolean mo30992a() {
        return true;
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    public String toString() {
        return mo49105e() + " [text: " + this.f67171a + "]";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.behavior.shadow.text.RawTextShadowNode$1 */
    public static /* synthetic */ class C285491 {

        /* renamed from: a */
        static final /* synthetic */ int[] f67173a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
                r0 = 34563(0x8703, float:4.8433E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.lynx.react.bridge.ReadableType[] r0 = com.lynx.react.bridge.ReadableType.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.lynx.tasm.behavior.shadow.text.RawTextShadowNode.C285491.f67173a = r2
                com.lynx.react.bridge.ReadableType r0 = com.lynx.react.bridge.ReadableType.String     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.lynx.tasm.behavior.shadow.text.RawTextShadowNode.C285491.f67173a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.lynx.react.bridge.ReadableType r0 = com.lynx.react.bridge.ReadableType.Int     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.lynx.tasm.behavior.shadow.text.RawTextShadowNode.C285491.f67173a     // Catch:{ NoSuchFieldError -> 0x002e }
                com.lynx.react.bridge.ReadableType r0 = com.lynx.react.bridge.ReadableType.Long     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.lynx.tasm.behavior.shadow.text.RawTextShadowNode.C285491.f67173a     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.lynx.react.bridge.ReadableType r0 = com.lynx.react.bridge.ReadableType.Number     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r2 = com.lynx.tasm.behavior.shadow.text.RawTextShadowNode.C285491.f67173a     // Catch:{ NoSuchFieldError -> 0x0044 }
                com.lynx.react.bridge.ReadableType r0 = com.lynx.react.bridge.ReadableType.Boolean     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r2 = com.lynx.tasm.behavior.shadow.text.RawTextShadowNode.C285491.f67173a     // Catch:{ NoSuchFieldError -> 0x004f }
                com.lynx.react.bridge.ReadableType r0 = com.lynx.react.bridge.ReadableType.Null     // Catch:{ NoSuchFieldError -> 0x004f }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r0 = 6
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.shadow.text.RawTextShadowNode.C285491.<clinit>():void");
        }
    }

    @AbstractC28525m(mo49059a = "pseudo")
    public void setPsuedo(boolean z) {
        this.f67172b = z;
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    /* renamed from: b */
    public final void mo49104b(C28716v vVar) {
        ReadableMap readableMap = vVar.f67715a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            try {
                if (nextKey.equals("text")) {
                    setText(readableMap.getDynamic("text"));
                } else if (nextKey.equals("pseudo")) {
                    setPsuedo(readableMap.getBoolean(nextKey, false));
                }
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException("setProperty error: " + nextKey + "\n" + e.toString());
            }
        }
        super.mo49104b(vVar);
    }

    @AbstractC28525m(mo49059a = "text")
    public void setText(AbstractC28367a aVar) {
        switch (C285491.f67173a[aVar.mo48559h().ordinal()]) {
            case 1:
                this.f67171a = aVar.mo48556e();
                break;
            case 2:
            case 3:
                this.f67171a = String.valueOf(aVar.mo48555d());
                break;
            case 4:
                this.f67171a = new DecimalFormat("###################.###########").format(aVar.mo48554c());
                break;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                this.f67171a = String.valueOf(aVar.mo48553b());
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                this.f67171a = null;
                break;
        }
        mo49092d();
    }
}
