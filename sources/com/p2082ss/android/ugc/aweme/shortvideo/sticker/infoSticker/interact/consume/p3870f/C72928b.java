package com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3870f;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.miniapp_api.C59308d;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C72890c;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72921b;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a;
import com.p2082ss.android.ugc.aweme.sticker.C75391j;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.b */
public final class C72928b extends AbstractC72927a {

    /* renamed from: a */
    private final BusinessExtraData f163649a;

    static {
        Covode.recordClassIndex(85628);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3870f.AbstractC72927a
    /* renamed from: a */
    public final List<NormalTrackTimeStamp> mo115231a(long j, InteractStickerStruct interactStickerStruct) {
        C89219l.m154721d(interactStickerStruct, "");
        return C72890c.m128718a(j, interactStickerStruct);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3870f.AbstractC72927a
    /* renamed from: a */
    public final void mo115232a(float f, float f2, AbstractC72921b bVar) {
        String str;
        C89219l.m154721d(bVar, "");
        BusinessExtraData businessExtraData = this.f163649a;
        if (businessExtraData != null) {
            str = businessExtraData.getSchemaUrlOpenFirst();
        } else {
            str = null;
        }
        if (!C59308d.m109008c(str)) {
            bVar.mo115309a(this.f163646d.mo115356b(f, f2));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3870f.AbstractC72927a, com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72922c
    /* renamed from: a */
    public final boolean mo115224a(long j, int i, float f, float f2) {
        String str;
        BusinessExtraData businessExtraData = this.f163649a;
        String str2 = null;
        if (businessExtraData != null) {
            str = businessExtraData.getStickerId();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        BusinessExtraData businessExtraData2 = this.f163649a;
        if (businessExtraData2 != null) {
            str2 = businessExtraData2.getSchemaUrlOpenFirst();
        }
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        return super.mo115224a(j, i, f, f2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72928b(Context context, AbstractC72946a aVar, InteractStickerStruct interactStickerStruct, C75391j jVar, BusinessExtraData businessExtraData) {
        super(context, aVar, interactStickerStruct, jVar);
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(interactStickerStruct, "");
        this.f163649a = businessExtraData;
    }
}
