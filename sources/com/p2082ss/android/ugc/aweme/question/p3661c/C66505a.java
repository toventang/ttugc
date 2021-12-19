package com.p2082ss.android.ugc.aweme.question.p3661c;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.detail.DetailViewModel;
import com.p2082ss.android.ugc.aweme.favorites.p2924f.AbstractC47430d;
import com.p2082ss.android.ugc.aweme.favorites.p2924f.C47426a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.music.p3481ui.CheckableImageView;
import com.p2082ss.android.ugc.aweme.p2757dg.C41472d;
import com.p2082ss.android.ugc.aweme.question.C66504c;
import com.p2082ss.android.ugc.aweme.question.model.QuestionDetailParam;
import com.p2082ss.android.ugc.aweme.question.p3666h.p3667a.C66539c;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.question.c.a */
public final class C66505a implements AbstractC1214u<Boolean>, AbstractC47430d {

    /* renamed from: a */
    public C66504c f149512a;

    /* renamed from: b */
    public C66539c f149513b;

    /* renamed from: c */
    public boolean f149514c;

    /* renamed from: d */
    public boolean f149515d;

    /* renamed from: e */
    public boolean f149516e;

    /* renamed from: f */
    public final View f149517f;

    /* renamed from: g */
    private final C47426a f149518g;

    /* renamed from: h */
    private C41472d f149519h;

    /* renamed from: i */
    private final CheckableImageView f149520i;

    /* renamed from: j */
    private final TextView f149521j;

    /* renamed from: k */
    private final QuestionDetailParam f149522k;

    static {
        Covode.recordClassIndex(78048);
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2924f.AbstractC47430d
    /* renamed from: a */
    public final void mo62589a(String str) {
    }

    /* renamed from: d */
    private final void m118252d() {
        this.f149516e = !this.f149516e;
    }

    /* renamed from: a */
    public final void mo105485a() {
        int i;
        CheckableImageView checkableImageView = this.f149520i;
        if (this.f149516e) {
            i = R.drawable.b2e;
        } else {
            i = 2131233168;
        }
        checkableImageView.setImageResource(i);
    }

    /* renamed from: b */
    public final void mo105486b() {
        int i;
        TextView textView = this.f149521j;
        if (textView != null) {
            if (this.f149516e) {
                i = R.string.pf;
            } else {
                i = R.string.p_;
            }
            textView.setText(i);
        }
        C41472d dVar = this.f149519h;
        if (dVar != null && !this.f149516e && dVar.isShowing()) {
            dVar.dismiss();
        }
        if (this.f149516e) {
            this.f149515d = true;
        }
    }

    /* renamed from: c */
    public final void mo105487c() {
        String str;
        String str2;
        String str3 = null;
        if (this.f149516e) {
            QuestionDetailParam questionDetailParam = this.f149522k;
            if (questionDetailParam != null) {
                str2 = questionDetailParam.getId();
            } else {
                str2 = null;
            }
            C33744d dVar = new C33744d();
            dVar.mo59983a("enter_from", "qa_detail");
            if (str2 != null) {
                dVar.mo59983a("question_id", str2);
            }
            C39162r.m79460a("cancel_favorite_qa", dVar.f79943a);
        } else {
            QuestionDetailParam questionDetailParam2 = this.f149522k;
            if (questionDetailParam2 != null) {
                str = questionDetailParam2.getId();
            } else {
                str = null;
            }
            C33744d dVar2 = new C33744d();
            dVar2.mo59983a("enter_from", "qa_detail");
            if (str != null) {
                dVar2.mo59983a("question_id", str);
            }
            C39162r.m79460a("favorite_qa", dVar2.f79943a);
        }
        C47426a aVar = this.f149518g;
        Object[] objArr = new Object[3];
        objArr[0] = 7;
        C66504c cVar = this.f149512a;
        if (cVar == null) {
            C89219l.m154710a("mData");
        }
        Long id = cVar.getId();
        if (id != null) {
            str3 = String.valueOf(id.longValue());
        }
        objArr[1] = str3;
        objArr[2] = Integer.valueOf(1 ^ (this.f149516e ? 1 : 0));
        aVar.mo57616a(objArr);
        m118252d();
        this.f149520i.mo98607b();
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2924f.AbstractC47430d
    /* renamed from: e_ */
    public final void mo62592e_(Exception exc) {
        C51423a.m95790a((Throwable) exc);
        m118252d();
        mo105485a();
        mo105486b();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(Boolean bool) {
        C41472d dVar = this.f149519h;
        if (dVar != null && dVar.isShowing()) {
            dVar.dismiss();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2924f.AbstractC47430d
    /* renamed from: a */
    public final void mo62587a(BaseResponse baseResponse) {
        int i;
        C66504c cVar = this.f149512a;
        if (cVar == null) {
            C89219l.m154710a("mData");
        }
        if (this.f149516e) {
            i = 1;
        } else {
            i = 0;
        }
        cVar.setCollectStatus(i);
        if (this.f149516e) {
            this.f149514c = true;
        }
    }

    public C66505a(View view, CheckableImageView checkableImageView, TextView textView, QuestionDetailParam questionDetailParam) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(checkableImageView, "");
        this.f149517f = view;
        this.f149520i = checkableImageView;
        this.f149521j = textView;
        this.f149522k = questionDetailParam;
        C47426a aVar = new C47426a();
        this.f149518g = aVar;
        view.setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.question.p3661c.C66505a.View$OnClickListenerC665061 */

            /* renamed from: a */
            final /* synthetic */ C66505a f149523a;

            /* renamed from: com.ss.android.ugc.aweme.question.c.a$1$a */
            final /* synthetic */ class C66508a implements AbstractC34543f {

                /* renamed from: a */
                private final /* synthetic */ AbstractC89171a f149524a;

                static {
                    Covode.recordClassIndex(78051);
                }

                C66508a(AbstractC89171a aVar) {
                    this.f149524a = aVar;
                }

                @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
                /* renamed from: a */
                public final /* synthetic */ void mo57673a() {
                    C89219l.m154716b(this.f149524a.invoke(), "");
                }

                @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
                /* renamed from: b */
                public final void mo57674b() {
                }
            }

            static {
                Covode.recordClassIndex(78049);
            }

            {
                this.f149523a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f149523a.f149514c = false;
                this.f149523a.f149515d = false;
                if (!C31575b.m65865g().isLogin()) {
                    C58957c.m108320a(C34729o.m70962d(this.f149523a.f149517f), "qa_detail", "click_favorite_question", (Bundle) null, new C66508a(new AbstractC89171a<C89391z>(this.f149523a) {
                        /* class com.p2082ss.android.ugc.aweme.question.p3661c.C66505a.View$OnClickListenerC665061.C665071 */

                        static {
                            Covode.recordClassIndex(78050);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // p4600h.p4611f.p4612a.AbstractC89171a
                        public final /* synthetic */ C89391z invoke() {
                            ((C66505a) this.receiver).mo105487c();
                            return C89391z.f203057a;
                        }
                    }));
                } else {
                    this.f149523a.mo105487c();
                }
            }
        });
        checkableImageView.setOnStateChangeListener(new CheckableImageView.AbstractC61078a(this) {
            /* class com.p2082ss.android.ugc.aweme.question.p3661c.C66505a.C665092 */

            /* renamed from: a */
            final /* synthetic */ C66505a f149525a;

            static {
                Covode.recordClassIndex(78052);
            }

            @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.CheckableImageView.AbstractC61078a
            public final void bX_() {
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f149525a = r1;
            }

            @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.CheckableImageView.AbstractC61078a
            /* renamed from: a */
            public final void mo62594a(int i) {
                if (i == 1) {
                    this.f149525a.mo105485a();
                    this.f149525a.mo105486b();
                }
            }
        });
        aVar.mo67839a_(this);
        Activity d = C34729o.m70962d(view);
        Objects.requireNonNull(d, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        NextLiveData<Boolean> nextLiveData = ((DetailViewModel) C1181ae.m3881a((ActivityC0945e) d, (C1175ad.AbstractC1177b) null).mo3983a(DetailViewModel.class)).f96065a;
        Activity d2 = C34729o.m70962d(view);
        Objects.requireNonNull(d2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        nextLiveData.observe((ActivityC0945e) d2, this);
    }
}
