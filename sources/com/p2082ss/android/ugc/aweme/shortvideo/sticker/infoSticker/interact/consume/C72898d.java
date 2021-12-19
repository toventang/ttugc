package com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72926g;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C72967b;
import com.p2082ss.android.ugc.aweme.sticker.C75391j;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.p3963k.AbstractC75401d;
import com.p2082ss.android.ugc.aweme.utils.GsonHolder;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d */
public final class C72898d {

    /* renamed from: a */
    public static final C72899a f163570a = new C72899a((byte) 0);

    static {
        Covode.recordClassIndex(85593);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d$a */
    public static final class C72899a {
        static {
            Covode.recordClassIndex(85594);
        }

        private C72899a() {
        }

        public /* synthetic */ C72899a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C72967b m128735a(Context context, C75391j jVar, InteractStickerStruct interactStickerStruct, View view, AbstractC72926g gVar, Aweme aweme) {
            BusinessExtraData businessExtraData;
            AbstractC75401d.C75402a aVar;
            float f;
            C89219l.m154721d(context, "");
            C89219l.m154721d(interactStickerStruct, "");
            C89219l.m154721d(view, "");
            if (jVar != null) {
                AbstractC75401d dVar = jVar.f169459n;
                if (dVar != null) {
                    aVar = dVar.mo80041a();
                } else {
                    aVar = null;
                }
                float f2 = 0.0f;
                if (jVar != null) {
                    if (aVar != null) {
                        f = (float) aVar.f169476a;
                    } else {
                        f = 0.0f;
                    }
                    jVar.f169446a = f;
                    if (aVar != null) {
                        f2 = (float) aVar.f169477b;
                    }
                    jVar.f169447b = f2;
                }
            }
            try {
                businessExtraData = (BusinessExtraData) GsonHolder.m138943c().mo123620b().mo46670a(new JSONObject(interactStickerStruct.getAttr()).getString("interaction_extra"), BusinessExtraData.class);
            } catch (Exception e) {
                e.printStackTrace();
                businessExtraData = null;
            }
            return new C72967b(interactStickerStruct.getType(), context, view, interactStickerStruct, jVar, gVar, businessExtraData, aweme);
        }
    }
}
