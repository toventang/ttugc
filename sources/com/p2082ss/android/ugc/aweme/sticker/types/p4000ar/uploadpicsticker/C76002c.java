package com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.c */
public final class C76002c {

    /* renamed from: a */
    public static List<String> f170762a = new ArrayList();

    /* renamed from: b */
    public static boolean f170763b;

    /* renamed from: c */
    static boolean f170764c = true;

    /* renamed from: d */
    public static boolean f170765d = true;

    /* renamed from: e */
    public static final C76002c f170766e = new C76002c();

    private C76002c() {
    }

    static {
        Covode.recordClassIndex(88946);
    }

    /* renamed from: a */
    public static final boolean m133280a(Effect effect) {
        String sdkExtra;
        if (effect != null && (sdkExtra = effect.getSdkExtra()) != null && C89361p.m154908a((CharSequence) sdkExtra, (CharSequence) "pl", false) && C89361p.m154908a((CharSequence) sdkExtra, (CharSequence) "alg", false)) {
            try {
                return new JSONObject(effect.getSdkExtra()).has("pl");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:21:0x003e */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* renamed from: a */
    public static C75990a m133279a(Effect effect, boolean z) {
        String sdkExtra;
        int i;
        int i2;
        boolean z2;
        Exception e;
        int i3;
        if (!(effect == null || (sdkExtra = effect.getSdkExtra()) == null)) {
            boolean z3 = false;
            if (C89361p.m154908a((CharSequence) sdkExtra, (CharSequence) "pl", false) && C89361p.m154908a((CharSequence) sdkExtra, (CharSequence) "alg", false)) {
                boolean z4 = true;
                int i4 = 1;
                boolean z5 = true;
                try {
                    JSONObject optJSONObject = new JSONObject(sdkExtra).optJSONObject("pl");
                    if (optJSONObject != null) {
                        try {
                            if (!optJSONObject.has("min_count") || !optJSONObject.has("max_count") || !z) {
                                i3 = 0;
                                i = 0;
                            } else {
                                try {
                                    i = optJSONObject.optInt("min_count");
                                    try {
                                        i4 = optJSONObject.optInt("max_count");
                                        z3 = true;
                                        i3 = i4;
                                    } catch (Exception e2) {
                                        e = e2;
                                        z5 = i4;
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    i = 0;
                                    z2 = true;
                                    z4 = z5;
                                    e.printStackTrace();
                                    z3 = z4 ? 1 : 0;
                                    i2 = 0;
                                    return new C75990a(z3, z2, i, i2);
                                }
                            }
                            z2 = z3;
                            z3 = true;
                            i2 = i3;
                        } catch (Exception e4) {
                            e = e4;
                            i = 0;
                            z2 = false;
                            e.printStackTrace();
                            z3 = z4 ? 1 : 0;
                            i2 = 0;
                            return new C75990a(z3, z2, i, i2);
                        }
                    } else {
                        i2 = 0;
                        i = 0;
                        z2 = false;
                    }
                } catch (Exception e5) {
                    e = e5;
                    i = 0;
                    z2 = false;
                    z4 = false;
                    e.printStackTrace();
                    z3 = z4 ? 1 : 0;
                    i2 = 0;
                    return new C75990a(z3, z2, i, i2);
                }
                return new C75990a(z3, z2, i, i2);
            }
        }
        return null;
    }
}
