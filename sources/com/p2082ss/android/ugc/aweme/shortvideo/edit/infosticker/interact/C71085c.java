package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact;

import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c */
public class C71085c implements Serializable {

    /* renamed from: a */
    private String f159202a;

    /* renamed from: b */
    private LinkedHashMap<String, InteractStickerStruct> f159203b;

    /* renamed from: c */
    private LinkedHashMap<String, InteractStickerStruct> f159204c;
    @AbstractC27891c(mo46611a = "multi_edit_map")

    /* renamed from: d */
    private LinkedHashMap<String, List<InteractStickerStruct>> f159205d;
    @AbstractC27891c(mo46611a = "multi_record_map")

    /* renamed from: e */
    private LinkedHashMap<String, List<InteractStickerStruct>> f159206e;

    static {
        Covode.recordClassIndex(83584);
    }

    public String getExtra() {
        return this.f159202a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c$1 */
    public static /* synthetic */ class C710861 {

        /* renamed from: a */
        static final /* synthetic */ int[] f159207a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        static {
            /*
                r0 = 83585(0x14681, float:1.17128E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d[] r0 = com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.EnumC71088d.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C71085c.C710861.f159207a = r2
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d r0 = com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.EnumC71088d.TRACK_PAGE_RECORD     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C71085c.C710861.f159207a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d r0 = com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.EnumC71088d.TRACK_PAGE_EDIT     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C71085c.C710861.<clinit>():void");
        }
    }

    public void setExtra(String str) {
        this.f159202a = str;
    }

    public boolean isEmpty(EnumC71088d... dVarArr) {
        for (EnumC71088d dVar : dVarArr) {
            if (!m125639a(dVar).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private LinkedHashMap<String, List<InteractStickerStruct>> m125639a(EnumC71088d dVar) {
        int i = C710861.f159207a[dVar.ordinal()];
        if (i == 1) {
            if (this.f159206e == null) {
                this.f159206e = C71064a.m125525a(this.f159203b);
            }
            return this.f159206e;
        } else if (i != 2) {
            return new LinkedHashMap<>();
        } else {
            if (this.f159205d == null) {
                this.f159205d = C71064a.m125525a(this.f159204c);
            }
            return this.f159205d;
        }
    }

    public List<InteractStickerStruct> getStickerStructsByPage(EnumC71088d... dVarArr) {
        ArrayList arrayList = new ArrayList();
        for (EnumC71088d dVar : dVarArr) {
            LinkedHashMap<String, List<InteractStickerStruct>> a = m125639a(dVar);
            for (String str : a.keySet()) {
                List<InteractStickerStruct> list = a.get(str);
                if (list != null) {
                    arrayList.addAll(list);
                }
            }
        }
        return arrayList;
    }

    public List<InteractStickerStruct> getTrackByType(Integer num, EnumC71088d dVar) {
        LinkedHashMap<String, List<InteractStickerStruct>> a = m125639a(dVar);
        if (a.isEmpty()) {
            return null;
        }
        return a.get(String.valueOf(num));
    }

    public boolean removeStickerStructByPage(EnumC71088d dVar, int i) {
        LinkedHashMap<String, List<InteractStickerStruct>> a = m125639a(dVar);
        if (a.get(String.valueOf(i)) == null) {
            return false;
        }
        a.remove(String.valueOf(i));
        return true;
    }

    public void upDateStickerStructs(List<InteractStickerStruct> list, EnumC71088d dVar) {
        LinkedHashMap<String, List<InteractStickerStruct>> a = m125639a(dVar);
        a.clear();
        if (!C13603b.m24435a((Collection) list)) {
            for (InteractStickerStruct interactStickerStruct : list) {
                int i = -1;
                int type = interactStickerStruct.getType();
                if (type == 16) {
                    i = 16;
                } else if (type != 17) {
                    switch (type) {
                        case 3:
                            i = 1;
                            break;
                        case 4:
                            i = 2;
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            i = 3;
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            i = 4;
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            i = 5;
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            i = 8;
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            i = 9;
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                            i = 10;
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                            i = 11;
                            break;
                    }
                } else {
                    i = 12;
                }
                if (a.get(String.valueOf(i)) == null) {
                    a.put(String.valueOf(i), new ArrayList());
                }
                a.get(String.valueOf(i)).add(interactStickerStruct);
            }
        }
    }
}
