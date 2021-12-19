package com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.p3342b;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.kids.common.p3330c.C57354e;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.p3341a.C57435a;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b.a */
public abstract class AbstractC57436a {

    /* renamed from: d */
    public Aweme f130950d;

    /* renamed from: e */
    protected DataCenter f130951e;

    /* renamed from: f */
    protected final Context f130952f;

    /* renamed from: g */
    protected final View f130953g;

    /* renamed from: h */
    protected Fragment f130954h;

    /* renamed from: i */
    public String f130955i;

    static {
        Covode.recordClassIndex(67365);
    }

    /* renamed from: a */
    public abstract void mo94687a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo94689a(View view);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo94690a(DataCenter dataCenter);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String mo94694b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Map<String, String> mo94700c() {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo94710f() {
        if (this.f130950d != null) {
            C33743c a = new C33743c().mo59976a("widget_name", mo94694b()).mo59976a("enter_from", this.f130955i).mo59976a("group_id", this.f130950d.getAid()).mo59976a("author_id", this.f130950d.getAuthorUid()).mo59976a("log_pb", this.f130950d.getLogPbString());
            Map<String, String> c = mo94700c();
            if (c != null) {
                for (Map.Entry<String, String> entry : c.entrySet()) {
                    a.mo59976a(entry.getKey(), entry.getValue());
                }
            }
            C57354e.m103958a(mo94694b(), a.mo59977a());
        }
    }

    /* renamed from: b */
    public final void mo94709b(DataCenter dataCenter) {
        if (dataCenter != null) {
            this.f130951e = dataCenter;
            mo94690a(dataCenter);
        }
    }

    public AbstractC57436a(View view) {
        this.f130952f = view.getContext();
        this.f130953g = view;
        view.setOnClickListener(new View$OnClickListenerC57437b(this));
        mo94689a(view);
    }

    /* renamed from: a */
    public void mo94691a(C57435a aVar) {
        if (aVar != null) {
            this.f130950d = aVar.f130947a;
            this.f130954h = aVar.f130948b;
            this.f130955i = aVar.f130949c;
        }
    }
}
