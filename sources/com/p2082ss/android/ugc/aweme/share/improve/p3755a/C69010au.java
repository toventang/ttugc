package com.p2082ss.android.ugc.aweme.share.improve.p3755a;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1664o.C22515g;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.share.ShareDependService;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89350l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.au */
public final class C69010au implements AbstractC69693h {

    /* renamed from: a */
    private final Aweme f154358a;

    /* renamed from: b */
    private final String f154359b;

    /* renamed from: c */
    private final boolean f154360c;

    static {
        Covode.recordClassIndex(81324);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: b */
    public final int mo61918b() {
        return R.string.fcf;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: c */
    public final String mo61919c() {
        return "reuse_sticker";
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    public final int co_() {
        return R.raw.icon_2pt_mask;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: d */
    public final boolean mo61921d() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: e */
    public final boolean mo61922e() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: f */
    public final boolean mo61923f() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: g */
    public final int mo61924g() {
        return R.raw.icon_effect;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61914a(Context context) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(context, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61916a(ImageView imageView) {
        C89219l.m154721d(imageView, "");
        C89219l.m154721d(imageView, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61917a(TextView textView) {
        C89219l.m154721d(textView, "");
        AbstractC69693h.C69694a.m123110a(this, textView);
    }

    private C69010au(Aweme aweme, String str) {
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(str, "");
        this.f154358a = aweme;
        this.f154359b = str;
        this.f154360c = false;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61915a(Context context, SharePackage sharePackage) {
        Collection collection;
        C89219l.m154721d(context, "");
        C89219l.m154721d(sharePackage, "");
        if (MSAdaptionService.m97895c().mo89375b(context)) {
            C22515g.m42471a(context);
            return;
        }
        FaceStickerBean.sCurPropSource = "prop_reuse";
        if (!this.f154360c) {
            C39162r.m79460a("prop_reuse_icon", new C33744d().mo59983a("prop_id", this.f154358a.getStickerIDs()).mo59983a("action_type", "click").mo59983a("group_id", this.f154358a.getAid()).f79943a);
        }
        ArrayList<String> arrayList = new ArrayList<>();
        if (!TextUtils.isEmpty(this.f154358a.getStickerIDs())) {
            String stickerIDs = this.f154358a.getStickerIDs();
            C89219l.m154716b(stickerIDs, "");
            List<String> split = new C89350l(",").split(stickerIDs, 0);
            if (!split.isEmpty()) {
                ListIterator<String> listIterator = split.listIterator(split.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (listIterator.previous().length() != 0) {
                            collection = C89070n.m154571d((Iterable) split, listIterator.nextIndex() + 1);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            collection = C89086z.INSTANCE;
            Object[] array = collection.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            String[] strArr = (String[]) array;
            for (String str : strArr) {
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
        }
        boolean downloadEffectOrMusicAfterEnterCamera = AVExternalServiceImpl.m113114a().configService().avsettingsConfig().downloadEffectOrMusicAfterEnterCamera();
        ShareDependService a = ShareDependService.C68822a.m121324a();
        Aweme aweme = this.f154358a;
        boolean z = this.f154360c;
        Video video = aweme.getVideo();
        C89219l.m154716b(video, "");
        a.mo109333a(context, aweme, z, arrayList, "prop_reuse", video.getVideoLength(), downloadEffectOrMusicAfterEnterCamera);
    }

    public /* synthetic */ C69010au(Aweme aweme, String str, byte b) {
        this(aweme, str);
    }
}
