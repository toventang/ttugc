package com.p2082ss.android.ugc.aweme.commentStickerPanel.net;

import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.p2504a.C37357d;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.p2504a.C37358e;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.p2504a.EnumC37354a;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63196au;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
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

/* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.net.CommentStickerPanelRequestApi */
public final class CommentStickerPanelRequestApi {

    /* renamed from: b */
    public static final C37420a f88313b = new C37420a((byte) 0);

    /* renamed from: d */
    private static final String f88314d;

    /* renamed from: a */
    public List<Integer> f88315a = C89070n.m154524c(-1, -1);

    /* renamed from: c */
    private final Api f88316c;

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.net.CommentStickerPanelRequestApi$Api */
    public interface Api {
        static {
            Covode.recordClassIndex(44802);
        }

        @AbstractC89722f(mo144276a = "/tiktok/comment/recommend/v1")
        AbstractC88979t<C37358e> getCommentStickerFromNet(@AbstractC89736t(mo144292a = "requests") String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.net.CommentStickerPanelRequestApi$a */
    public static final class C37420a {
        static {
            Covode.recordClassIndex(44803);
        }

        private C37420a() {
        }

        public /* synthetic */ C37420a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(44801);
        AVApi b = AVApiImpl.m123134b();
        C89219l.m154716b(b, "");
        f88314d = b.mo109850a();
    }

    public CommentStickerPanelRequestApi() {
        AbstractC63196au C = C63244g.m114602a().mo73257C();
        String str = f88314d;
        C89219l.m154716b(str, "");
        this.f88316c = (Api) C.createRetrofit(str, true, Api.class);
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.net.CommentStickerPanelRequestApi$c */
    public static final class C37422c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ CommentStickerPanelRequestApi f88320a;

        /* renamed from: b */
        final /* synthetic */ int f88321b;

        static {
            Covode.recordClassIndex(44805);
        }

        C37422c(CommentStickerPanelRequestApi commentStickerPanelRequestApi, int i) {
            this.f88320a = commentStickerPanelRequestApi;
            this.f88321b = i;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f88320a.mo65065a(this.f88321b, 2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.net.CommentStickerPanelRequestApi$b */
    public static final class C37421b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ CommentStickerPanelRequestApi f88317a;

        /* renamed from: b */
        final /* synthetic */ int f88318b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89172b f88319c;

        static {
            Covode.recordClassIndex(44804);
        }

        C37421b(CommentStickerPanelRequestApi commentStickerPanelRequestApi, int i, AbstractC89172b bVar) {
            this.f88317a = commentStickerPanelRequestApi;
            this.f88318b = i;
            this.f88319c = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C37358e eVar = (C37358e) obj;
            Integer num = eVar.f88147a;
            if (num != null && num.intValue() == 0) {
                this.f88317a.mo65065a(this.f88318b, 1);
                AbstractC89172b bVar = this.f88319c;
                if (bVar != null) {
                    C89219l.m154716b(eVar, "");
                    bVar.invoke(eVar);
                    return;
                }
                return;
            }
            this.f88317a.mo65065a(this.f88318b, 2);
        }
    }

    /* renamed from: a */
    public final void mo65065a(int i, int i2) {
        if (i == 1) {
            this.f88315a.set(1, Integer.valueOf(i2));
        } else if (i == 2) {
            this.f88315a.set(0, Integer.valueOf(i2));
        } else if (i == 3) {
            this.f88315a.set(0, Integer.valueOf(i2));
            this.f88315a.set(1, Integer.valueOf(i2));
        }
    }

    /* renamed from: a */
    private void m75463a(int i, int i2, AbstractC89172b<? super C37358e, C89391z> bVar, int i3) {
        ArrayList arrayList = new ArrayList();
        if (i3 == EnumC37354a.Favorites.getValue()) {
            arrayList.add(new C37357d(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(EnumC37354a.Favorites.getValue())));
        } else if (i3 == EnumC37354a.Recommended.getValue()) {
            arrayList.add(new C37357d(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(EnumC37354a.Recommended.getValue())));
        } else if (i3 == EnumC37354a.Both.getValue()) {
            arrayList.add(new C37357d(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(EnumC37354a.Favorites.getValue())));
            arrayList.add(new C37357d(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(EnumC37354a.Recommended.getValue())));
        }
        mo65065a(i3, 0);
        Api api = this.f88316c;
        String b = new C27910f().mo46674b(arrayList);
        C89219l.m154716b(b, "");
        api.getCommentStickerFromNet(b).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C37421b(this, i3, bVar), new C37422c(this, i3));
    }

    /* renamed from: a */
    public static /* synthetic */ void m75464a(CommentStickerPanelRequestApi commentStickerPanelRequestApi, int i, int i2, AbstractC89172b bVar, int i3, int i4) {
        if ((i4 & 1) != 0) {
            i = 0;
        }
        if ((i4 & 2) != 0) {
            i2 = 30;
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        commentStickerPanelRequestApi.m75463a(i, i2, bVar, i3);
    }
}
