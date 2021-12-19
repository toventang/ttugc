package com.p2082ss.android.ugc.aweme.notification.view.template;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.inbox.p3269d.C56378h;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61630e;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p2082ss.android.ugc.aweme.notification.p3523e.C61968c;
import com.p2082ss.android.ugc.aweme.notification.p3529h.p3530a.AbstractC62027a;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.p2479ck.C36131u;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.view.template.g */
public abstract class AbstractView$OnClickListenerC62342g extends FrameLayout implements View.OnClickListener {

    /* renamed from: a */
    private C61630e f141483a;

    /* renamed from: b */
    private MusNotice f141484b;

    /* renamed from: c */
    private AbstractC62027a f141485c;

    /* renamed from: d */
    private SparseArray f141486d;

    static {
        Covode.recordClassIndex(73127);
    }

    /* renamed from: a */
    public View mo100306a(int i) {
        if (this.f141486d == null) {
            this.f141486d = new SparseArray();
        }
        View view = (View) this.f141486d.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f141486d.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public abstract boolean mo100308a(View view);

    /* renamed from: b */
    public abstract String mo100309b(View view);

    public abstract EnumC62343h getTemplatePosition();

    /* access modifiers changed from: protected */
    public final MusNotice getMBaseNotice() {
        return this.f141484b;
    }

    /* access modifiers changed from: protected */
    public final AbstractC62027a getMBridge() {
        return this.f141485c;
    }

    /* access modifiers changed from: protected */
    public final C61630e getTemplateNotice() {
        return this.f141483a;
    }

    /* renamed from: a */
    private final void mo100313a() {
        AbstractC62027a aVar = this.f141485c;
        if (aVar != null) {
            aVar.mo100095o();
        }
    }

    /* access modifiers changed from: protected */
    public final void setMBaseNotice(MusNotice musNotice) {
        this.f141484b = musNotice;
    }

    /* access modifiers changed from: protected */
    public final void setMBridge(AbstractC62027a aVar) {
        this.f141485c = aVar;
    }

    /* access modifiers changed from: protected */
    public final void setTemplateNotice(C61630e eVar) {
        this.f141483a = eVar;
    }

    public void onClick(View view) {
        C61630e eVar;
        String str;
        int i;
        C61630e eVar2;
        ClickAgent.onClick(view);
        if (!C58001a.m104815a(view, 1200)) {
            AbstractC62027a aVar = this.f141485c;
            if (!(aVar == null || (eVar2 = this.f141483a) == null)) {
                String b = mo100309b(view);
                EnumC62343h templatePosition = getTemplatePosition();
                int l = aVar.mo100092l();
                String m = aVar.mo100093m();
                String j = aVar.mo100090j();
                String i2 = aVar.mo100089i();
                if (i2 == null) {
                    i2 = "";
                }
                C62341f fVar = new C62341f(eVar2, view, b, templatePosition, l, m, j, i2, aVar.mo100091k());
                aVar.mo100094n();
                List<AbstractC62329c> h = aVar.mo100088h();
                if (h != null) {
                    Iterator<T> it = h.iterator();
                    while (it.hasNext()) {
                        if (it.next().mo100002a(fVar)) {
                            mo100313a();
                            return;
                        }
                    }
                }
            }
            if (!mo100308a(view) && (eVar = this.f141483a) != null && (str = eVar.f139892h) != null) {
                AbstractC62027a aVar2 = this.f141485c;
                if (aVar2 != null) {
                    C61630e eVar3 = this.f141483a;
                    if (eVar3 != null) {
                        i = eVar3.f139897m;
                    } else {
                        i = -1;
                    }
                    aVar2.mo100087d(i);
                }
                mo100329a(str);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo100329a(String str) {
        Integer num;
        String str2;
        C89219l.m154721d(str, "");
        MusNotice musNotice = this.f141484b;
        String str3 = null;
        if (musNotice != null) {
            num = Integer.valueOf(musNotice.type);
        } else {
            num = null;
        }
        MusNotice musNotice2 = this.f141484b;
        if (musNotice2 != null) {
            str2 = musNotice2.nid;
        } else {
            str2 = null;
        }
        C56378h.m102355a(str, num, str2);
        C61968c.HandlerC61971c b = C61968c.m112097b();
        if (b != null) {
            b.mo100034b(this.f141484b);
        }
        mo100313a();
        Uri parse = Uri.parse(str);
        C89219l.m154716b(parse, "");
        Context context = getContext();
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        C36125t a = C36125t.m73591a();
        C36131u a2 = C36131u.m73602a(str);
        AbstractC62027a aVar = this.f141485c;
        if (aVar != null) {
            str3 = aVar.mo100090j();
        }
        C36131u a3 = a2.mo63248a("second_tab_name", str3);
        String queryParameter = parse.getQueryParameter("show_comment");
        if (queryParameter == null) {
            queryParameter = "0";
        }
        C36131u a4 = a3.mo63248a("comment_force_open_reply", queryParameter);
        String queryParameter2 = parse.getQueryParameter("enter_method");
        if (queryParameter2 == null) {
            queryParameter2 = "click";
        }
        C36131u a5 = a4.mo63248a("enter_method", queryParameter2);
        C89219l.m154716b(a5, "");
        C36125t.m73596a(a, activity, C61968c.m112095a(a5, str).f85356a.mo52126a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo100328a(View view, View.OnClickListener onClickListener) {
        C89219l.m154721d(onClickListener, "");
        if (view != null) {
            view.setOnClickListener(onClickListener);
            AbstractC62027a aVar = this.f141485c;
            if (aVar != null) {
                view.setOnLongClickListener(aVar.mo100096p());
            }
        }
    }

    /* renamed from: a */
    public void mo100307a(MusNotice musNotice, AbstractC62027a aVar) {
        C89219l.m154721d(musNotice, "");
        C89219l.m154721d(aVar, "");
        this.f141484b = musNotice;
        this.f141483a = musNotice.templateNotice;
        this.f141485c = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractView$OnClickListenerC62342g(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
    }
}
