package com.p2082ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.C86687a;
import com.p2082ss.ugc.effectplatform.model.net.InfoStickerEffect;
import com.p2082ss.ugc.effectplatform.model.net.InfoStickerListModel;
import com.p2082ss.ugc.effectplatform.model.net.InfoStickerListResponse;
import com.p2082ss.ugc.effectplatform.p4440a.p4442b.C86695b;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.C86701e;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.EnumC86699c;
import com.p2082ss.ugc.effectplatform.util.C86992i;
import com.p2082ss.ugc.effectplatform.util.C86993j;
import com.p2082ss.ugc.effectplatform.util.C87002p;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p4519d.p4520a.p4530d.p4531a.C88045d;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.ugc.effectplatform.task.af */
public final class C86875af extends AbstractC86851a<InfoStickerListResponse, InfoStickerListResponse> {

    /* renamed from: c */
    private final C86687a f195863c;

    /* renamed from: d */
    private final int f195864d;

    /* renamed from: f */
    private final String f195865f;

    /* renamed from: g */
    private final String f195866g;

    /* renamed from: h */
    private final Integer f195867h;

    /* renamed from: i */
    private final Integer f195868i;

    /* renamed from: j */
    private final String f195869j = null;

    /* renamed from: k */
    private final Map<String, String> f195870k = null;

    /* renamed from: l */
    private final String f195871l;

    static {
        Covode.recordClassIndex(102640);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: c */
    public final C86701e mo140550c() {
        HashMap<String, String> a = C86992i.m150657a(this.f195863c, true);
        a.put("creation_id", this.f195865f);
        a.put("source", String.valueOf(this.f195864d));
        a.put("image_uri", this.f195866g);
        Integer num = this.f195867h;
        if (num != null) {
            a.put("count", String.valueOf(num.intValue()));
        }
        Integer num2 = this.f195868i;
        if (num2 != null) {
            a.put("cursor", String.valueOf(num2.intValue()));
        }
        String str = this.f195869j;
        if (str != null) {
            a.put("library", str);
        }
        Map<String, String> map = this.f195870k;
        if (map != null && !map.isEmpty()) {
            a.putAll(this.f195870k);
        }
        return new C86701e(C87002p.m150693a(a, this.f195863c.f195433A + this.f195863c.f195445a + "/sticker/recommend"), EnumC86699c.GET, null, null, false, 60);
    }

    /* Return type fixed from 'com.ss.ugc.effectplatform.model.h' to match base method */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: a */
    public final /* synthetic */ InfoStickerListResponse mo140547a(C86695b bVar, String str) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(str, "");
        return (InfoStickerListResponse) bVar.f195508a.convertJsonToObj(str, InfoStickerListResponse.class);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [long, long, long, com.ss.ugc.effectplatform.model.h] */
    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86851a
    /* renamed from: a */
    public final /* synthetic */ void mo140548a(long j, long j2, long j3, InfoStickerListResponse infoStickerListResponse) {
        List<InfoStickerEffect> list;
        String str;
        InfoStickerListResponse infoStickerListResponse2 = infoStickerListResponse;
        C89219l.m154719c(infoStickerListResponse2, "");
        String str2 = this.f195863c.f195453i;
        InfoStickerListModel data = infoStickerListResponse2.getData();
        if (data != null) {
            list = data.getSticker_list();
        } else {
            list = null;
        }
        C89219l.m154719c(str2, "");
        if (list != null) {
            for (T t : list) {
                Integer source = t.getSource();
                if (source != null) {
                    if (source.intValue() == 1) {
                        t.getLoki_effect().setZipPath(str2 + C88045d.f199951a + t.getLoki_effect().getId() + ".zip");
                        t.getLoki_effect().setUnzipPath(str2 + C88045d.f199951a + t.getLoki_effect().getId());
                        C86993j.m150660a(str2, t.getLoki_effect());
                    } else if (source.intValue() == 2) {
                        String a = C86993j.m150658a(t.getSticker());
                        if (a != null) {
                            int a2 = C89361p.m154885a((CharSequence) a, "/");
                            int a3 = C89361p.m154885a((CharSequence) a, ".");
                            if (a2 > 0 && a3 > a2) {
                                str = a.substring(a3, a.length());
                                C89219l.m154709a((Object) str, "");
                                t.getSticker().setPath(str2 + C88045d.f199951a + t.getSticker().getId() + str);
                            }
                        }
                        str = "";
                        t.getSticker().setPath(str2 + C88045d.f199951a + t.getSticker().getId() + str);
                    }
                }
            }
        }
        super.mo140548a(j, j2, j3, infoStickerListResponse2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86875af(C86687a aVar, int i, String str, String str2, Integer num, Integer num2, String str3) {
        super(aVar.f195462r.f199870a, aVar.f195461q, aVar.f195443K, str3);
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(str3, "");
        this.f195863c = aVar;
        this.f195864d = i;
        this.f195865f = str;
        this.f195866g = str2;
        this.f195867h = num;
        this.f195868i = num2;
        this.f195871l = str3;
    }
}
