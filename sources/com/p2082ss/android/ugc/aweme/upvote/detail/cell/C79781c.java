package com.p2082ss.android.ugc.aweme.upvote.detail.cell;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.follow.widet.C51086a;
import com.p2082ss.android.ugc.aweme.following.p3003ui.view.AbstractC51346a;
import com.p2082ss.android.ugc.aweme.metrics.C59256u;
import com.p2082ss.android.ugc.aweme.metrics.C59260v;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.recommend.C66623g;
import com.p2082ss.android.ugc.aweme.upvote.event.C79899b;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4568e.p4573e.p4574a.C88502d;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4589j.C88934a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.upvote.detail.cell.c */
public final class C79781c implements AbstractC51346a {

    /* renamed from: g */
    public static final C79782a f178983g = new C79782a((byte) 0);

    /* renamed from: a */
    final AbstractC89244h f178984a = C89250i.m154773a((AbstractC89171a) new C79784c(this));

    /* renamed from: b */
    User f178985b;

    /* renamed from: c */
    C79899b f178986c;

    /* renamed from: d */
    int f178987d = -1;

    /* renamed from: e */
    public boolean f178988e;

    /* renamed from: f */
    public final TuxTextView f178989f;

    /* renamed from: h */
    private final AbstractC89244h f178990h = C89250i.m154773a((AbstractC89171a) C79783b.f178992a);

    /* renamed from: i */
    private final AbstractC1204m f178991i;

    static {
        Covode.recordClassIndex(93005);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C88411a mo123365a() {
        return (C88411a) this.f178990h.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.cell.c$a */
    public static final class C79782a {
        static {
            Covode.recordClassIndex(93006);
        }

        private C79782a() {
        }

        public /* synthetic */ C79782a(byte b) {
            this();
        }

        /* renamed from: a */
        public static boolean m138607a(Integer num) {
            if (num != null && num.intValue() == 0) {
                return true;
            }
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.view.AbstractC51346a
    public final AbstractC1204m getLifeCycleOwner() {
        return this.f178991i;
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.cell.c$b */
    static final class C79783b extends AbstractC89220m implements AbstractC89171a<C88411a> {

        /* renamed from: a */
        public static final C79783b f178992a = new C79783b();

        static {
            Covode.recordClassIndex(93007);
        }

        C79783b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C88411a invoke() {
            return new C88411a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.cell.c$d */
    static final class C79786d implements AbstractC88428a {

        /* renamed from: a */
        final /* synthetic */ C79781c f178995a;

        static {
            Covode.recordClassIndex(93010);
        }

        C79786d(C79781c cVar) {
            this.f178995a = cVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88428a
        /* renamed from: a */
        public final void mo8579a() {
            this.f178995a.f178989f.setVisibility(8);
            this.f178995a.f178988e = false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.view.AbstractC51346a
    public final Context getContext() {
        Context context = this.f178989f.getContext();
        C89219l.m154716b(context, "");
        return context;
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.cell.c$c */
    static final class C79784c extends AbstractC89220m implements AbstractC89171a<C51086a> {

        /* renamed from: a */
        final /* synthetic */ C79781c f178993a;

        static {
            Covode.recordClassIndex(93008);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79784c(C79781c cVar) {
            super(0);
            this.f178993a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C51086a invoke() {
            C51086a aVar = new C51086a(this.f178993a, new C51086a.C51094g());
            aVar.f117879e = new C79785a(this);
            return aVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.upvote.detail.cell.c$c$a */
        static final class C79785a implements C51086a.AbstractC51090c {

            /* renamed from: a */
            final /* synthetic */ C79784c f178994a;

            static {
                Covode.recordClassIndex(93009);
            }

            C79785a(C79784c cVar) {
                this.f178994a = cVar;
            }

            @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51090c
            /* renamed from: a */
            public final boolean mo63341a(int i) {
                String str;
                int i2;
                String str2;
                if (this.f178994a.f178993a.f178988e) {
                    return true;
                }
                C79781c cVar = this.f178994a.f178993a;
                cVar.f178988e = true;
                AbstractC88412b cN_ = C88925a.m154165a(C88502d.f200771a).mo142936a(3, TimeUnit.SECONDS).mo142941b(C88925a.m154180b(C88946a.f201991c)).mo142937a(C88391a.m153580a(C88392a.f200660a)).mo142938a(new C79786d(cVar)).cN_();
                String str3 = "";
                C89219l.m154716b(cN_, str3);
                C88934a.m154195a(cN_, cVar.mo123365a());
                C79781c cVar2 = this.f178994a.f178993a;
                C59260v vVar = new C59260v();
                C79899b bVar = cVar2.f178986c;
                if (!(bVar == null || (str2 = bVar.f179145a) == null)) {
                    str3 = str2;
                }
                C59260v a = vVar.mo96847a(str3);
                C59256u.EnumC59258b a2 = C66623g.C66624a.m118386a(cVar2.f178985b);
                if (a2 != null) {
                    str = a2.getType();
                } else {
                    str = null;
                }
                a.f135412v = str;
                User user = cVar2.f178985b;
                if (user == null || !user.isPrivateAccount()) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                a.f135376aa = i2;
                a.mo96786a("sub_page", "recommend_panel").mo96785a("rank", cVar2.f178987d + 1).mo96792f();
                return false;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.view.AbstractC51346a
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f178989f.setOnClickListener(onClickListener);
    }

    public C79781c(TuxTextView tuxTextView, AbstractC1204m mVar) {
        C89219l.m154721d(tuxTextView, "");
        C89219l.m154721d(mVar, "");
        this.f178989f = tuxTextView;
        this.f178991i = mVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.view.AbstractC51346a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo73175a(int r5, int r6) {
        /*
        // Method dump skipped, instructions count: 205
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.upvote.detail.cell.C79781c.mo73175a(int, int):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.view.AbstractC51346a
    /* renamed from: a */
    public final void mo86406a(int i, int i2, String str) {
        mo73175a(i, i2);
    }
}
