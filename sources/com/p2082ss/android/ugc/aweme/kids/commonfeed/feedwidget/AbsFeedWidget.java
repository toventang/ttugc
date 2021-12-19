package com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget;

import android.view.View;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.GenericWidget;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.p3341a.C57435a;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.p3342b.AbstractC57436a;

/* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.AbsFeedWidget */
public abstract class AbsFeedWidget extends GenericWidget implements AbstractC1214u<C33942b> {

    /* renamed from: a */
    private AbstractC57436a f130893a;

    static {
        Covode.recordClassIndex(67340);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract AbstractC57436a mo94686b(View view);

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onStop() {
        super.onStop();
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onDestroy() {
        super.onDestroy();
        AbstractC57436a aVar = this.f130893a;
        if (aVar != null) {
            aVar.mo94687a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onCreate() {
        super.onCreate();
        this.f80273e.mo60189a("feed_item_params_data", (AbstractC1214u<C33942b>) this).mo60189a("on_page_selected", (AbstractC1214u<C33942b>) this);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.GenericWidget, androidx.lifecycle.AbstractC1214u
    public /* synthetic */ void onChanged(C33942b bVar) {
        onChanged(bVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    /* renamed from: a */
    public final void mo60206a(View view) {
        super.mo60206a(view);
        AbstractC57436a b = mo94686b(view);
        this.f130893a = b;
        b.mo94709b(this.f80273e);
        C57435a aVar = (C57435a) this.f80273e.mo60192a("feed_item_params_data");
        if (aVar != null) {
            this.f130893a.mo94691a(aVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.GenericWidget
    /* renamed from: a */
    public final void mo60180a(C33942b bVar) {
        if (bVar != null) {
            String str = bVar.f80277a;
            int hashCode = str.hashCode();
            if (hashCode == 350216171) {
                if (str.equals("on_page_selected")) {
                }
            } else if (hashCode == 1809593368 && str.equals("feed_item_params_data")) {
                C57435a aVar = (C57435a) bVar.mo60212a();
                AbstractC57436a aVar2 = this.f130893a;
                if (aVar2 != null) {
                    aVar2.mo94691a(aVar);
                }
            }
        }
    }
}
