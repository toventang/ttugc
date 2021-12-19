package com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3870f;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C72890c;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72921b;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C73065r;
import com.p2082ss.android.ugc.aweme.sticker.C75384i;
import com.p2082ss.android.ugc.aweme.sticker.C75391j;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.p2082ss.android.ugc.aweme.sticker.data.TextStruct;
import com.p2082ss.android.ugc.aweme.utils.GsonHolder;
import com.p2082ss.android.ugc.aweme.utils.GsonProvider;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.g */
public final class C72937g extends AbstractC72927a {

    /* renamed from: a */
    private final AbstractC89244h f163662a;

    static {
        Covode.recordClassIndex(85637);
    }

    /* renamed from: a */
    public final TextStruct mo115330a() {
        return (TextStruct) this.f163662a.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.g$a */
    static final class C72938a extends AbstractC89220m implements AbstractC89171a<TextStruct> {

        /* renamed from: a */
        final /* synthetic */ InteractStickerStruct f163663a;

        static {
            Covode.recordClassIndex(85638);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72938a(InteractStickerStruct interactStickerStruct) {
            super(0);
            this.f163663a = interactStickerStruct;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public TextStruct invoke() {
            try {
                GsonProvider c = GsonHolder.m138943c();
                C89219l.m154716b(c, "");
                return (TextStruct) c.mo123620b().mo46670a(this.f163663a.getTextStruct(), TextStruct.class);
            } catch (Exception unused) {
                return new TextStruct(null, 1, null);
            }
        }
    }

    /* renamed from: b */
    public final Map<String, String> mo115331b() {
        String str;
        String str2;
        C75384i iVar;
        String str3;
        C75384i iVar2;
        C75384i iVar3;
        HashMap hashMap = new HashMap();
        hashMap.put("close", "false");
        hashMap.put("back", "true");
        hashMap.put("hide_nav_bar", "false");
        C75391j jVar = this.f163648f;
        String str4 = "";
        if (jVar == null || (iVar3 = jVar.f169463r) == null || (str = iVar3.f169428b) == null) {
            str = str4;
        }
        hashMap.put("author_id", str);
        C75391j jVar2 = this.f163648f;
        if (jVar2 == null || (iVar2 = jVar2.f169463r) == null || (str2 = iVar2.f169429c) == null) {
            str2 = str4;
        }
        hashMap.put("group_id", str2);
        C75391j jVar3 = this.f163648f;
        if (!(jVar3 == null || (iVar = jVar3.f169463r) == null || (str3 = iVar.f169427a) == null)) {
            str4 = str3;
        }
        hashMap.put("enter_from", str4);
        return hashMap;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3870f.AbstractC72927a
    /* renamed from: a */
    public final List<NormalTrackTimeStamp> mo115231a(long j, InteractStickerStruct interactStickerStruct) {
        C89219l.m154721d(interactStickerStruct, "");
        return C72890c.m128723b(j, interactStickerStruct);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3870f.AbstractC72927a
    /* renamed from: a */
    public final void mo115232a(float f, float f2, AbstractC72921b bVar) {
        C89219l.m154721d(bVar, "");
        bVar.mo115309a(this.f163646d.mo115356b(f, f2));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72937g(Context context, C73065r rVar, InteractStickerStruct interactStickerStruct, C75391j jVar) {
        super(context, rVar, interactStickerStruct, jVar);
        C89219l.m154721d(context, "");
        C89219l.m154721d(rVar, "");
        C89219l.m154721d(interactStickerStruct, "");
        this.f163662a = C89250i.m154773a((AbstractC89171a) new C72938a(interactStickerStruct));
    }
}
