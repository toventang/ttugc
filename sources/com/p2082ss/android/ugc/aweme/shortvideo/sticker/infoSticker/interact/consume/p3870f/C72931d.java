package com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3870f;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.tooltip.AbstractC23317a;
import com.bytedance.tux.tooltip.EnumC23352h;
import com.bytedance.tux.tooltip.p1727a.p1728a.C23319b;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C72890c;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72921b;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C73038n;
import com.p2082ss.android.ugc.aweme.sticker.C75391j;
import com.p2082ss.android.ugc.aweme.sticker.data.HashtagStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.MentionStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.d */
public final class C72931d extends AbstractC72927a {
    static {
        Covode.recordClassIndex(85631);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3870f.AbstractC72927a
    /* renamed from: a */
    public final List<NormalTrackTimeStamp> mo115231a(long j, InteractStickerStruct interactStickerStruct) {
        C89219l.m154721d(interactStickerStruct, "");
        return C72890c.m128719a(interactStickerStruct);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3870f.AbstractC72927a
    /* renamed from: a */
    public final void mo115232a(float f, float f2, AbstractC72921b bVar) {
        HashtagStruct hashtagInfo;
        InteractStickerStruct interactStickerStruct;
        MentionStruct mentionInfo;
        String userId;
        MentionStruct mentionInfo2;
        UrlModel avatarUrl;
        List<String> urlList;
        String str = "";
        C89219l.m154721d(bVar, str);
        AbstractC72946a aVar = this.f163646d;
        Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.MentionHashTagInteractStickerView");
        C73038n nVar = (C73038n) aVar;
        int[] iArr = new int[2];
        nVar.f163696j.getLocationOnScreen(iArr);
        if (nVar.f163694h == 8 && (interactStickerStruct = nVar.f163692f) != null && interactStickerStruct.getMentionInfo() != null) {
            InteractStickerStruct interactStickerStruct2 = nVar.f163692f;
            if (interactStickerStruct2 != null && (mentionInfo = interactStickerStruct2.getMentionInfo()) != null && (userId = mentionInfo.getUserId()) != null && userId.length() != 0) {
                InteractStickerStruct interactStickerStruct3 = nVar.f163692f;
                if (!(interactStickerStruct3 == null || (mentionInfo2 = interactStickerStruct3.getMentionInfo()) == null || (avatarUrl = mentionInfo2.getAvatarUrl()) == null || (urlList = avatarUrl.getUrlList()) == null || urlList.isEmpty())) {
                    String str2 = urlList.get(0);
                    C89219l.m154716b(str2, str);
                    str = str2;
                }
                AbstractC23317a d = ((C23319b) new C23319b(nVar.f163695i).mo38034a(EnumC23352h.TOP).mo38029a(((int) f) + iArr[0], ((int) f2) + iArr[1])).mo38011a(new C73038n.C73043e(nVar, str)).mo38012d();
                d.mo38006a(true, new C73038n.View$OnClickListenerC73041c(nVar));
                d.mo38001a();
            }
        } else if (nVar.f163694h == 9) {
            InteractStickerStruct interactStickerStruct4 = nVar.f163692f;
            if (interactStickerStruct4 == null || (hashtagInfo = interactStickerStruct4.getHashtagInfo()) == null || hashtagInfo.getStatus() != 0) {
                AbstractC23317a d2 = ((C23319b) new C23319b(nVar.f163695i).mo38034a(EnumC23352h.TOP).mo38029a(((int) f) + iArr[0], ((int) f2) + iArr[1])).mo38011a(new C73038n.C73046f(nVar)).mo38037a(true, (View.OnClickListener) new C73038n.View$OnClickListenerC73048g(nVar)).mo38012d();
                d2.mo38006a(true, new C73038n.View$OnClickListenerC73042d(nVar));
                d2.mo38001a();
                return;
            }
            new C23144b(nVar.mo115474c()).mo37635a(nVar.f163695i.getResources().getString(R.string.ca0)).mo37637b();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72931d(Context context, C73038n nVar, InteractStickerStruct interactStickerStruct, C75391j jVar) {
        super(context, nVar, interactStickerStruct, jVar);
        C89219l.m154721d(context, "");
        C89219l.m154721d(nVar, "");
        C89219l.m154721d(interactStickerStruct, "");
    }
}
