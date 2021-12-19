package com.bytedance.bpea.entry.p873a.p876c;

import com.bytedance.bpea.basics.C13340a;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.entry.common.C13397a;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import java.util.LinkedHashSet;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.bpea.entry.a.c.a */
public final class C13390a {

    /* renamed from: a */
    public static final C13391a f32685a = new C13391a((byte) 0);

    static {
        Covode.recordClassIndex(15387);
    }

    /* renamed from: com.bytedance.bpea.entry.a.c.a$a */
    public static final class C13391a {
        static {
            Covode.recordClassIndex(15388);
        }

        private C13391a() {
        }

        public /* synthetic */ C13391a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C13340a m24077a(String[] strArr, PrivacyCert privacyCert) {
            C89219l.m154719c(strArr, "");
            try {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (String str : strArr) {
                    switch (str.hashCode()) {
                        case -1888586689:
                            if (!str.equals("android.permission.ACCESS_FINE_LOCATION")) {
                                continue;
                            }
                            break;
                        case -63024214:
                            if (str.equals("android.permission.ACCESS_COARSE_LOCATION")) {
                                break;
                            } else {
                                continue;
                            }
                        case 463403621:
                            if (str.equals("android.permission.CAMERA")) {
                                linkedHashSet.add("video");
                            } else {
                                continue;
                            }
                        case 1831139720:
                            if (str.equals("android.permission.RECORD_AUDIO")) {
                                linkedHashSet.add(DataType.AUDIO);
                            } else {
                                continue;
                            }
                        default:
                            continue;
                    }
                    linkedHashSet.add("latitudeAndLongitude");
                }
                if (!linkedHashSet.isEmpty()) {
                    Object[] array = linkedHashSet.toArray(new String[0]);
                    if (array != null) {
                        C13397a.C13398a.m24082a(privacyCert, (String[]) array, "permission_request");
                    } else {
                        throw new C89388w("null cannot be cast to non-null type");
                    }
                }
                return null;
            } catch (C13340a e) {
                return e;
            }
        }
    }
}
