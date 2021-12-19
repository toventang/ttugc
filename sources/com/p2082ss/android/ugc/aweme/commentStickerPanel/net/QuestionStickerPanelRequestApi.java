package com.p2082ss.android.ugc.aweme.commentStickerPanel.net;

import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.p2504a.C37362i;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.p2504a.C37363j;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.p2504a.EnumC37361h;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63196au;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.C65412cv;
import com.p2082ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.p2082ss.android.ugc.aweme.tools.AVApi;
import java.util.ArrayList;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.net.QuestionStickerPanelRequestApi */
public final class QuestionStickerPanelRequestApi {

    /* renamed from: b */
    public static final C37423a f88322b = new C37423a((byte) 0);

    /* renamed from: d */
    private static final String f88323d;

    /* renamed from: a */
    public List<Integer> f88324a = C89070n.m154524c(-1, -1);

    /* renamed from: c */
    private final Api f88325c;

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.net.QuestionStickerPanelRequestApi$Api */
    public interface Api {
        static {
            Covode.recordClassIndex(44807);
        }

        @AbstractC89722f(mo144276a = "/tiktok/v1/forum/question/suggest/")
        AbstractC88979t<C37363j> getQuestionStickerFromNet(@AbstractC89736t(mo144292a = "requests") String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.net.QuestionStickerPanelRequestApi$a */
    public static final class C37423a {
        static {
            Covode.recordClassIndex(44808);
        }

        private C37423a() {
        }

        public /* synthetic */ C37423a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(44806);
        AVApi b = AVApiImpl.m123134b();
        C89219l.m154716b(b, "");
        f88323d = b.mo109850a();
    }

    public QuestionStickerPanelRequestApi() {
        AbstractC63196au C = C63244g.m114602a().mo73257C();
        String str = f88323d;
        C89219l.m154716b(str, "");
        this.f88325c = (Api) C.createRetrofit(str, true, Api.class);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.net.QuestionStickerPanelRequestApi$c */
    public static final class C37425c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ QuestionStickerPanelRequestApi f88329a;

        /* renamed from: b */
        final /* synthetic */ int f88330b;

        static {
            Covode.recordClassIndex(44810);
        }

        C37425c(QuestionStickerPanelRequestApi questionStickerPanelRequestApi, int i) {
            this.f88329a = questionStickerPanelRequestApi;
            this.f88330b = i;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f88329a.mo65067a(this.f88330b, 2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.net.QuestionStickerPanelRequestApi$b */
    public static final class C37424b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ QuestionStickerPanelRequestApi f88326a;

        /* renamed from: b */
        final /* synthetic */ int f88327b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89172b f88328c;

        static {
            Covode.recordClassIndex(44809);
        }

        C37424b(QuestionStickerPanelRequestApi questionStickerPanelRequestApi, int i, AbstractC89172b bVar) {
            this.f88326a = questionStickerPanelRequestApi;
            this.f88327b = i;
            this.f88328c = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C37363j jVar = (C37363j) obj;
            Integer num = jVar.f88159a;
            if (num != null && num.intValue() == 0) {
                this.f88326a.mo65067a(this.f88327b, 1);
                AbstractC89172b bVar = this.f88328c;
                C89219l.m154716b(jVar, "");
                bVar.invoke(jVar);
                return;
            }
            this.f88326a.mo65067a(this.f88327b, 2);
        }
    }

    /* renamed from: a */
    public final void mo65067a(int i, int i2) {
        if (i == 1) {
            this.f88324a.set(1, Integer.valueOf(i2));
        } else if (i == 2) {
            this.f88324a.set(0, Integer.valueOf(i2));
        } else if (i == 3) {
            this.f88324a.set(0, Integer.valueOf(i2));
            this.f88324a.set(1, Integer.valueOf(i2));
        }
    }

    /* renamed from: a */
    public void mo65068a(int i, AbstractC89172b<? super C37363j, C89391z> bVar, int i2) {
        C89219l.m154721d(bVar, "");
        ArrayList arrayList = new ArrayList();
        if (i2 == EnumC37361h.All.ordinal()) {
            if (C65412cv.m117130d()) {
                arrayList.add(new C37362i(Integer.valueOf(i), 6, EnumC37361h.QuestionCollectionFAVORITE.ordinal(), 0, 8));
            }
            if (C65412cv.m117129c()) {
                arrayList.add(new C37362i(Integer.valueOf(i), 6, EnumC37361h.QuestionCollectionRECOMMEND.ordinal(), 0, 8));
            }
            if (C65412cv.m117128b()) {
                arrayList.add(new C37362i(Integer.valueOf(i), 6, EnumC37361h.QuestionCollectionINVITATION.ordinal(), 0, 8));
            }
        } else {
            arrayList.add(new C37362i(Integer.valueOf(i), 6, i2, 0, 8));
        }
        mo65067a(i2, 0);
        Api api = this.f88325c;
        String b = new C27910f().mo46674b(arrayList);
        C89219l.m154716b(b, "");
        api.getQuestionStickerFromNet(b).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C37424b(this, i2, bVar), new C37425c(this, i2));
    }
}
