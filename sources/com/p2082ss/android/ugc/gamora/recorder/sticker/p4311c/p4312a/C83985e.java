package com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.p4312a;

import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C71073b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C71085c;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.EnumC71088d;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.recordinteraction.C71275a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.recordinteraction.RecordInteractExtra;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.p2082ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p2082ss.android.ugc.aweme.sticker.panel.guide.ExtraParams;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84013e;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.a.e */
public final class C83985e implements AbstractC84013e {

    /* renamed from: a */
    public FaceStickerBean f187482a;

    /* renamed from: b */
    private List<String> f187483b;

    /* renamed from: c */
    private C71275a f187484c;

    /* renamed from: d */
    private final ShortVideoContext f187485d;

    /* renamed from: e */
    private final AbstractC84089j f187486e;

    static {
        Covode.recordClassIndex(97878);
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84013e
    /* renamed from: a */
    public final void mo128853a() {
        List<InteractStickerStruct> stickerStructsByPage;
        Map map;
        NormalTrackTimeStamp[] normalTrackTimeStampArr;
        if (this.f187484c == null) {
            C71275a aVar = new C71275a();
            if (this.f187485d.f155817b.mo109889b() || this.f187485d.f155817b.mo109890c() || this.f187485d.mo110022c()) {
                aVar.f159740c = false;
            }
            if (!C13627m.m24498a(this.f187485d.f155794ad.f155705a)) {
                String str = this.f187485d.f155794ad.f155705a;
                int i = (int) this.f187485d.f155817b.f155651g;
                if (aVar.f159740c) {
                    aVar.f159743f = i;
                    EnumC71088d dVar = EnumC71088d.TRACK_PAGE_RECORD;
                    C71085c a = C71073b.m125558a(str);
                    if (a == null) {
                        stickerStructsByPage = null;
                    } else {
                        stickerStructsByPage = a.getStickerStructsByPage(dVar);
                    }
                    if (!C13603b.m24435a((Collection) stickerStructsByPage)) {
                        for (InteractStickerStruct interactStickerStruct : stickerStructsByPage) {
                            if (interactStickerStruct.getType() == 2 && !C13627m.m24498a(interactStickerStruct.getAttr()) && !C13627m.m24498a(interactStickerStruct.getTrackList()) && (map = (Map) C63238c.f143596w.getRetrofitFactoryGson().mo46670a(interactStickerStruct.getAttr(), Map.class)) != null && map.containsKey("interaction_extra")) {
                                try {
                                    RecordInteractExtra recordInteractExtra = (RecordInteractExtra) C63238c.f143596w.getRetrofitFactoryGson().mo46670a(new JSONObject((Map) map.get("interaction_extra")).toString(), RecordInteractExtra.class);
                                    if (!(recordInteractExtra == null || C13627m.m24498a(recordInteractExtra.getStickerId()) || (normalTrackTimeStampArr = (NormalTrackTimeStamp[]) C63238c.f143596w.getRetrofitFactoryGson().mo46670a(interactStickerStruct.getTrackList(), NormalTrackTimeStamp[].class)) == null || normalTrackTimeStampArr.length == 0)) {
                                        aVar.f159741d.put(recordInteractExtra.getStickerId(), new ArrayList(Arrays.asList(normalTrackTimeStampArr)));
                                        aVar.f159742e.put(recordInteractExtra.getStickerId(), recordInteractExtra.toExtraParams());
                                    }
                                } catch (Exception unused) {
                                }
                            }
                        }
                    }
                }
            }
            this.f187484c = aVar;
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84013e
    /* renamed from: a */
    public final void mo128856a(List<String> list) {
        this.f187483b = list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0080, code lost:
        if (p4600h.p4622m.C89361p.m154874b(r1, "http", false) == false) goto L_0x0082;
     */
    @Override // com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84013e
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo128854a(int r7) {
        /*
        // Method dump skipped, instructions count: 180
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.p4312a.C83985e.mo128854a(int):void");
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84013e
    /* renamed from: a */
    public final void mo128855a(ShortVideoContext shortVideoContext) {
        C89219l.m154721d(shortVideoContext, "");
        C71275a aVar = this.f187484c;
        if (aVar != null && aVar.f159740c) {
            int i = (int) shortVideoContext.f155817b.f155651g;
            if (aVar.f159740c && i - aVar.f159743f < -10) {
                aVar.mo112704a(i);
                aVar.f159743f = i;
            }
            LinkedList linkedList = new LinkedList();
            int i2 = 0;
            for (Map.Entry<String, List<NormalTrackTimeStamp>> entry : aVar.f159741d.entrySet()) {
                ExtraParams extraParams = aVar.f159742e.get(entry.getKey());
                List<NormalTrackTimeStamp> value = entry.getValue();
                if (!C13603b.m24435a((Collection) value) && extraParams != null) {
                    RecordInteractExtra recordInteractExtra = new RecordInteractExtra();
                    recordInteractExtra.formatFromExtraParams(extraParams, entry.getKey());
                    InteractStickerStruct interactStickerStruct = new InteractStickerStruct();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("interaction_extra", recordInteractExtra);
                    interactStickerStruct.setAttr(C63238c.f143596w.getRetrofitFactoryGson().mo46674b(linkedHashMap));
                    interactStickerStruct.setType(2);
                    interactStickerStruct.setIndex(i2);
                    interactStickerStruct.setTrackList(C63238c.f143596w.getRetrofitFactoryGson().mo46674b(value));
                    linkedList.add(interactStickerStruct);
                    i2++;
                }
            }
            shortVideoContext.f155794ad.f155705a = C71073b.m125562a(shortVideoContext.f155794ad.f155705a, linkedList, EnumC71088d.TRACK_PAGE_RECORD, aVar.f159744g);
        }
    }

    public C83985e(ShortVideoContext shortVideoContext, AbstractC84089j jVar) {
        C89219l.m154721d(shortVideoContext, "");
        C89219l.m154721d(jVar, "");
        this.f187485d = shortVideoContext;
        this.f187486e = jVar;
    }
}
