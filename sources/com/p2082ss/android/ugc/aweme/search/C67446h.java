package com.p2082ss.android.ugc.aweme.search;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.google.gson.C27917g;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.p2052ui.LynxUI;
import com.p2082ss.android.sdk.webview.C30248e;
import com.p2082ss.android.ugc.aweme.discover.helper.AbstractC42020h;
import com.p2082ss.android.ugc.aweme.discover.mob.ISearchResultStatistics;
import com.p2082ss.android.ugc.aweme.discover.p2773h.AbstractC41955b;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42639ae;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42640af;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.following.p3003ui.adapter.AbstractC51187d;
import com.p2082ss.android.ugc.aweme.keyword.AbstractC57066a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.search.model.C67674b;
import com.p2082ss.android.ugc.aweme.search.model.C67677c;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.search.model.FeedSearchIconViewModel;
import com.p2082ss.android.ugc.aweme.search.p3686d.AbstractC67363b;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.h */
public final class C67446h implements ISearchService {

    /* renamed from: a */
    public static final C67446h f151111a = new C67446h();

    /* renamed from: b */
    private final /* synthetic */ ISearchService f151112b;

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: a */
    public final Intent mo106187a(Activity activity, Uri uri) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(uri, "");
        return this.f151112b.mo106187a(activity, uri);
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: a */
    public final JediSimpleViewHolder<?> mo106188a(ViewGroup viewGroup, ActivityC0945e eVar) {
        C89219l.m154721d(viewGroup, "");
        return this.f151112b.mo106188a(viewGroup, eVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: a */
    public final LynxUI<?> mo106189a(AbstractC28520j jVar) {
        C89219l.m154721d(jVar, "");
        return this.f151112b.mo106189a(jVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: a */
    public final AbstractC42639ae mo106190a(C67678d dVar, AbstractC57066a.AbstractC57067a aVar, AbstractC51187d dVar2, AbstractC67363b bVar, String str) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(dVar2, "");
        return this.f151112b.mo106190a(dVar, aVar, dVar2, bVar, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: a */
    public final AbstractC42640af mo106191a(boolean z) {
        return this.f151112b.mo106191a(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: a */
    public final FeedSearchIconViewModel mo106192a(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        return this.f151112b.mo106192a(eVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: a */
    public final String mo106193a(User user, Context context) {
        return this.f151112b.mo106193a(user, context);
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: a */
    public final List<AbstractC16183k> mo106194a(C16248b bVar) {
        C89219l.m154721d(bVar, "");
        return this.f151112b.mo106194a(bVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: a */
    public final void mo106195a() {
        this.f151112b.mo106195a();
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: a */
    public final void mo106196a(int i) {
        this.f151112b.mo106196a(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: a */
    public final void mo106197a(int i, String str, int i2, String str2, String str3, String str4) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        this.f151112b.mo106197a(i, str, i2, str2, str3, str4);
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: a */
    public final void mo106198a(AbstractC1204m mVar, String str, Map<String, String> map) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(map, "");
        this.f151112b.mo106198a(mVar, str, map);
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: a */
    public final void mo106199a(C27917g gVar) {
        C89219l.m154721d(gVar, "");
        this.f151112b.mo106199a(gVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: a */
    public final void mo106200a(C30248e eVar, WeakReference<Context> weakReference) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(weakReference, "");
        this.f151112b.mo106200a(eVar, weakReference);
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: a */
    public final void mo106201a(C67677c cVar) {
        C89219l.m154721d(cVar, "");
        this.f151112b.mo106201a(cVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: a */
    public final void mo106202a(C67678d dVar) {
        C89219l.m154721d(dVar, "");
        this.f151112b.mo106202a(dVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: a */
    public final void mo106203a(Exception exc, String str) {
        C89219l.m154721d(exc, "");
        C89219l.m154721d(str, "");
        this.f151112b.mo106203a(exc, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: a */
    public final void mo106204a(String str, String str2, String str3, boolean z) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.f151112b.mo106204a(str, str2, str3, z);
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: a */
    public final void mo106205a(JSONObject jSONObject) {
        this.f151112b.mo106205a(jSONObject);
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: a */
    public final void mo106206a(boolean z, List<? extends Aweme> list, int i) {
        this.f151112b.mo106206a(z, list, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: a */
    public final boolean mo106207a(Activity activity) {
        return this.f151112b.mo106207a(activity);
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: b */
    public final LynxUI<?> mo106208b(AbstractC28520j jVar) {
        C89219l.m154721d(jVar, "");
        return this.f151112b.mo106208b(jVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: b */
    public final void mo106209b() {
        this.f151112b.mo106209b();
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: b */
    public final void mo106210b(C67678d dVar) {
        C89219l.m154721d(dVar, "");
        this.f151112b.mo106210b(dVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: b */
    public final void mo106211b(boolean z) {
        this.f151112b.mo106211b(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: c */
    public final LynxUI<?> mo106212c(AbstractC28520j jVar) {
        C89219l.m154721d(jVar, "");
        return this.f151112b.mo106212c(jVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: c */
    public final ISearchResultStatistics mo106213c() {
        return this.f151112b.mo106213c();
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: c */
    public final void mo106214c(boolean z) {
        this.f151112b.mo106214c(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: d */
    public final AbstractC67366e mo106215d() {
        return this.f151112b.mo106215d();
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: e */
    public final C67674b mo106216e() {
        return this.f151112b.mo106216e();
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: f */
    public final AbstractC41955b mo106217f() {
        return this.f151112b.mo106217f();
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: g */
    public final Fragment mo106218g() {
        return this.f151112b.mo106218g();
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: h */
    public final boolean mo106219h() {
        return this.f151112b.mo106219h();
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: i */
    public final boolean mo106220i() {
        return this.f151112b.mo106220i();
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: j */
    public final boolean mo106221j() {
        return this.f151112b.mo106221j();
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: k */
    public final boolean mo106222k() {
        return this.f151112b.mo106222k();
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: l */
    public final boolean mo106223l() {
        return this.f151112b.mo106223l();
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: m */
    public final void mo106224m() {
        this.f151112b.mo106224m();
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: n */
    public final AbstractC42020h mo106225n() {
        return this.f151112b.mo106225n();
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: o */
    public final boolean mo106226o() {
        return this.f151112b.mo106226o();
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: p */
    public final Map<String, String> mo106227p() {
        return this.f151112b.mo106227p();
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: q */
    public final boolean mo106228q() {
        return this.f151112b.mo106228q();
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: r */
    public final AbstractC88979t<?> mo106229r() {
        return this.f151112b.mo106229r();
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ISearchService
    /* renamed from: s */
    public final boolean mo106230s() {
        return this.f151112b.mo106230s();
    }

    static {
        Covode.recordClassIndex(79083);
    }

    private C67446h() {
        ISearchService t = SearchServiceImpl.m119336t();
        C89219l.m154716b(t, "");
        this.f151112b = t;
    }
}
