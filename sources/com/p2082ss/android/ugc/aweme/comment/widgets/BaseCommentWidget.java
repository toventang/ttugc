package com.p2082ss.android.ugc.aweme.comment.widgets;

import android.view.View;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p2082ss.android.ugc.aweme.comment.p2495i.C36500h;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.comment.widgets.BaseCommentWidget */
public abstract class BaseCommentWidget extends Widget implements AbstractC1214u<C33942b>, AbstractC33974au {

    /* renamed from: a */
    protected Aweme f87977a;

    /* renamed from: h */
    protected C36500h f87978h;

    static {
        Covode.recordClassIndex(44673);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo64903k() {
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final Aweme mo64897e() {
        Aweme aweme = this.f87977a;
        if (aweme == null) {
            C89219l.m154710a("aweme");
        }
        return aweme;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo64898f() {
        if (this.f87977a != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean mo64899g() {
        if (this.f87978h != null) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onDestroy() {
        super.onDestroy();
        this.f80273e.mo60188a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final String mo64900h() {
        if (!mo64899g()) {
            return "";
        }
        C36500h hVar = this.f87978h;
        if (hVar == null) {
            C89219l.m154710a("params");
        }
        String eventType = hVar.getEventType();
        C89219l.m154716b(eventType, "");
        return eventType;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final String mo64901i() {
        if (!mo64899g()) {
            return "";
        }
        C36500h hVar = this.f87978h;
        if (hVar == null) {
            C89219l.m154710a("params");
        }
        String enterFrom = hVar.getEnterFrom();
        C89219l.m154716b(enterFrom, "");
        return enterFrom;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final Integer mo64902j() {
        if (!mo64899g()) {
            return null;
        }
        C36500h hVar = this.f87978h;
        if (hVar == null) {
            C89219l.m154710a("params");
        }
        return Integer.valueOf(hVar.getPageType());
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onCreate() {
        super.onCreate();
        mo64903k();
        this.f80273e.mo60190a("comment_visible", this, true).mo60190a("comment_aweme_and_params", this, true);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.BaseCommentWidget$a */
    protected static final class C37302a<T extends View> {

        /* renamed from: a */
        public T f87979a;

        /* renamed from: b */
        public final int f87980b;

        static {
            Covode.recordClassIndex(44674);
        }

        public C37302a(int i) {
            this.f87980b = i;
        }

        /* renamed from: a */
        public final T mo64904a(BaseCommentWidget baseCommentWidget, AbstractC89286i<?> iVar) {
            C89219l.m154721d(baseCommentWidget, "");
            C89219l.m154721d(iVar, "");
            if (this.f87979a == null) {
                T t = (T) baseCommentWidget.f80272d.findViewById(this.f87980b);
                if (t == null) {
                    C89219l.m154715b();
                }
                this.f87979a = t;
            }
            T t2 = this.f87979a;
            if (t2 == null) {
                C89219l.m154710a("_value");
            }
            return t2;
        }
    }

    /* renamed from: a */
    protected static <T extends View> C37302a<T> m75298a(int i) {
        return new C37302a<>(i);
    }

    /* renamed from: a */
    protected static void m75299a(View... viewArr) {
        C89219l.m154721d(viewArr, "");
        for (View view : viewArr) {
            view.setVisibility(0);
        }
    }

    /* renamed from: b */
    protected static void m75300b(View... viewArr) {
        C89219l.m154721d(viewArr, "");
        for (View view : viewArr) {
            view.setVisibility(8);
        }
    }

    /* renamed from: a */
    public void onChanged(C33942b bVar) {
        Boolean bool;
        C89378p pVar;
        Aweme aweme;
        C36500h hVar;
        if (bVar != null) {
            String str = bVar.f80277a;
            int hashCode = str.hashCode();
            if (hashCode != 278836882) {
                if (hashCode == 2016314694 && str.equals("comment_aweme_and_params") && (pVar = (C89378p) bVar.mo60212a()) != null && (aweme = (Aweme) pVar.getFirst()) != null) {
                    this.f87977a = aweme;
                    C89378p pVar2 = (C89378p) bVar.mo60212a();
                    if (pVar2 != null && (hVar = (C36500h) pVar2.getSecond()) != null) {
                        this.f87978h = hVar;
                    }
                }
            } else if (str.equals("comment_visible") && (bool = (Boolean) bVar.mo60212a()) != null) {
                bool.booleanValue();
            }
        }
    }
}
