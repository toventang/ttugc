package com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.cukaie.closet.C14401a;
import com.p2082ss.android.ugc.aweme.infosticker.StickerChallenge;
import com.p2082ss.android.ugc.aweme.p2730de.C40963b;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C70637di;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.effectmanager.common.model.UrlModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.utils.C84915u;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.b */
public final class C70835b {

    /* renamed from: a */
    public static final C70835b f158593a = new C70835b();

    private C70835b() {
    }

    static {
        Covode.recordClassIndex(83326);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.b$a */
    public static final class CallableC70836a<V> implements Callable {

        /* renamed from: a */
        public static final CallableC70836a f158594a = new CallableC70836a();

        static {
            Covode.recordClassIndex(83327);
        }

        CallableC70836a() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            Context a = C40963b.m82473a();
            String str = C70637di.f158114q;
            C89219l.m154716b(str, "");
            C84915u.m145941a(a, (int) R.raw.baritone, str);
            String str2 = C70637di.f158114q;
            C89219l.m154716b(str2, "");
            C84915u.m145941a(a, (int) R.raw.chipmunk, str2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: c */
    private static void m125102c() {
        C63244g.m114602a().mo73290r().mo86003a();
        C1731i.m5640b(CallableC70836a.f158594a, C1731i.f5562a);
    }

    /* renamed from: a */
    public static void m125099a() {
        IAudioEffectPreferences iAudioEffectPreferences = (IAudioEffectPreferences) new C14401a().mo23215a(C40963b.m82473a(), IAudioEffectPreferences.class);
        int h = C63244g.m114602a().mo73295w().mo93779h();
        if (h != iAudioEffectPreferences.getResourceVersion(0)) {
            m125102c();
            iAudioEffectPreferences.setResourceVersion(h);
        }
    }

    /* renamed from: b */
    public static CategoryPageModel m125101b() {
        List b = C89070n.m154522b("chipmunk", "baritone");
        int i = 0;
        List b2 = C89070n.m154522b(2131230974, 2131230973);
        Context a = C40963b.m82473a();
        List b3 = C89070n.m154522b(a.getString(R.string.z5), a.getString(R.string.z4));
        List b4 = C89070n.m154522b("default_1", "default_2");
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) b2, 10));
        int i2 = -1;
        for (Object obj : b2) {
            int i3 = i + 1;
            if (i < 0) {
                C89070n.m154520a();
            }
            int intValue = ((Number) obj).intValue();
            Effect effect = new Effect(null, 1, null);
            int i4 = i2 - 1;
            effect.setEffectId(String.valueOf(i2));
            Object obj2 = b3.get(i);
            C89219l.m154716b(obj2, "");
            effect.setName((String) obj2);
            effect.setIconUrl(m125098a(intValue));
            effect.setUnzipPath(C70637di.f158114q + ((String) b.get(i)));
            effect.setTags(C89070n.m154516a(b4.get(i)));
            arrayList.add(effect);
            i2 = i4;
            i = i3;
        }
        CategoryPageModel categoryPageModel = new CategoryPageModel(null, 1, null);
        CategoryEffectModel categoryEffectModel = new CategoryEffectModel(null, 1, null);
        categoryEffectModel.setEffects(arrayList);
        categoryPageModel.setCategoryEffects(categoryEffectModel);
        return categoryPageModel;
    }

    /* renamed from: a */
    private static UrlModel m125098a(int i) {
        UrlModel urlModel = new UrlModel(null, 1, null);
        urlModel.setUrlList(C89070n.m154516a(String.valueOf(i)));
        return urlModel;
    }

    /* renamed from: a */
    public static final void m125100a(VideoPublishEditModel videoPublishEditModel) {
        AudioEffectParam audioEffectParam;
        AVChallenge challenge;
        T t;
        List<AVChallenge> recordStickerChallengeList;
        if (videoPublishEditModel != null && (audioEffectParam = videoPublishEditModel.veAudioEffectParam) != null && (challenge = audioEffectParam.getChallenge()) != null && videoPublishEditModel.challenges != null) {
            StickerChallenge stickerChallenge = videoPublishEditModel.stickerChallenge;
            T t2 = null;
            if (stickerChallenge != null && (recordStickerChallengeList = stickerChallenge.getRecordStickerChallengeList()) != null) {
                Iterator<T> it = recordStickerChallengeList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (C89219l.m154714a((Object) challenge.challengeName, (Object) t.challengeName)) {
                        break;
                    }
                }
            } else {
                t = null;
            }
            C70005cr a = C70005cr.m123611a();
            C89219l.m154716b(a, "");
            List<AVChallenge> list = a.f156485d;
            if (list != null) {
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    T next = it2.next();
                    if (C89219l.m154714a((Object) next.challengeName, (Object) challenge.challengeName)) {
                        t2 = next;
                        break;
                    }
                }
            }
            if (t == null && t2 == null) {
                videoPublishEditModel.challenges.remove(challenge);
                videoPublishEditModel.removeAudioEffectChallengeFromTitleAndStruct(challenge);
            }
        }
    }
}
