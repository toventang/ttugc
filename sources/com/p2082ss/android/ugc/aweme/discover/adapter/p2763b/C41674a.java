package com.p2082ss.android.ugc.aweme.discover.adapter.p2763b;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartAvatarImageView;
import com.p2082ss.android.ugc.aweme.discover.p2772g.AbstractC41953a;
import com.p2082ss.android.ugc.aweme.discover.p2773h.AbstractC41955b;
import com.p2082ss.android.ugc.aweme.discover.p2787m.AbstractC42295c;
import com.p2082ss.android.ugc.aweme.discover.widget.SugCompletionView;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.search.SearchServiceImpl;
import com.p2082ss.android.ugc.aweme.search.model.C67679e;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.b.a */
public final class C41674a extends RecyclerView.ViewHolder {

    /* renamed from: h */
    public static final C41675a f97206h = new C41675a((byte) 0);

    /* renamed from: a */
    final AbstractC89244h f97207a = C89250i.m154773a((AbstractC89171a) new C41677c(this));

    /* renamed from: b */
    final AbstractC89244h f97208b = C89250i.m154773a((AbstractC89171a) new C41676b(this));

    /* renamed from: c */
    final String f97209c;

    /* renamed from: d */
    public final View f97210d;

    /* renamed from: e */
    public final String f97211e;

    /* renamed from: f */
    public final AbstractC41953a f97212f;

    /* renamed from: g */
    public final SugCompletionView.AbstractC43029a f97213g;

    /* renamed from: i */
    private final AbstractC89244h f97214i = C89250i.m154773a((AbstractC89171a) C41680f.f97223a);

    /* renamed from: j */
    private final AbstractC89244h f97215j = C89250i.m154773a((AbstractC89171a) new C41678d(this));

    static {
        Covode.recordClassIndex(49587);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final AbstractC41955b mo70882a() {
        return (AbstractC41955b) this.f97214i.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final SmartAvatarImageView mo70883b() {
        return (SmartAvatarImageView) this.f97215j.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.b.a$a */
    public static final class C41675a {
        static {
            Covode.recordClassIndex(49588);
        }

        private C41675a() {
        }

        public /* synthetic */ C41675a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.b.a$b */
    static final class C41676b extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ C41674a f97216a;

        static {
            Covode.recordClassIndex(49589);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41676b(C41674a aVar) {
            super(0);
            this.f97216a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f97216a.f97210d.findViewById(R.id.dqr);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.b.a$c */
    static final class C41677c extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ C41674a f97217a;

        static {
            Covode.recordClassIndex(49590);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41677c(C41674a aVar) {
            super(0);
            this.f97217a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f97217a.f97210d.findViewById(R.id.dqs);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.b.a$d */
    static final class C41678d extends AbstractC89220m implements AbstractC89171a<SmartAvatarImageView> {

        /* renamed from: a */
        final /* synthetic */ C41674a f97218a;

        static {
            Covode.recordClassIndex(49591);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41678d(C41674a aVar) {
            super(0);
            this.f97218a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SmartAvatarImageView invoke() {
            return this.f97218a.f97210d.findViewById(R.id.dqq);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.b.a$e */
    public static final class C41679e extends AbstractC42295c {

        /* renamed from: a */
        final /* synthetic */ C41674a f97219a;

        /* renamed from: b */
        final /* synthetic */ C67679e f97220b;

        /* renamed from: c */
        final /* synthetic */ String f97221c;

        /* renamed from: d */
        final /* synthetic */ int f97222d;

        static {
            Covode.recordClassIndex(49592);
        }

        @Override // com.p2082ss.android.ugc.aweme.discover.p2787m.AbstractC42295c
        /* renamed from: a */
        public final void mo70884a() {
            SugCompletionView.AbstractC43029a aVar = this.f97219a.f97213g;
            if (aVar != null) {
                aVar.mo70891a(this.f97220b, this.f97222d);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42662aj
        /* renamed from: a */
        public final void mo70824a(View view) {
            if (!C58001a.m104815a(view, 1200) && this.f97220b != null) {
                SugCompletionView.AbstractC43029a aVar = this.f97219a.f97213g;
                if (aVar != null) {
                    aVar.mo70890a();
                }
                AbstractC41953a aVar2 = this.f97219a.f97212f;
                if (aVar2 != null) {
                    C67679e eVar = this.f97220b;
                    String str = this.f97221c;
                    if (str == null) {
                        str = "";
                    }
                    aVar2.mo71103a(eVar, str, this.f97222d);
                }
            }
        }

        C41679e(C41674a aVar, C67679e eVar, String str, int i) {
            this.f97219a = aVar;
            this.f97220b = eVar;
            this.f97221c = str;
            this.f97222d = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.b.a$f */
    static final class C41680f extends AbstractC89220m implements AbstractC89171a<AbstractC41955b> {

        /* renamed from: a */
        public static final C41680f f97223a = new C41680f();

        static {
            Covode.recordClassIndex(49593);
        }

        C41680f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC41955b invoke() {
            return SearchServiceImpl.m119336t().mo106217f();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41674a(View view, String str, AbstractC41953a aVar, SugCompletionView.AbstractC43029a aVar2) {
        super(view);
        C89219l.m154721d(view, "");
        this.f97210d = view;
        this.f97211e = str;
        this.f97212f = aVar;
        this.f97213g = aVar2;
        this.f97209c = str;
    }
}
