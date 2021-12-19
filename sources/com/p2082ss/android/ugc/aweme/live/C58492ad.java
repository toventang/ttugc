package com.p2082ss.android.ugc.aweme.live;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.broadcast.api.AbstractC3054d;
import com.bytedance.android.live.p255l.AbstractC4374a;
import com.bytedance.android.live.p379n.AbstractC5776i;
import com.bytedance.android.live.p379n.AbstractC5777j;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.callback.AbstractC7258b;
import com.bytedance.android.livesdk.callback.IHostLongPressCallback;
import com.bytedance.android.livesdk.container.AbstractC8220c;
import com.bytedance.android.livesdk.feed.FullDraggableContainer;
import com.bytedance.android.livesdk.watch.AbstractC11321b;
import com.bytedance.android.livesdk.watch.AbstractC11322c;
import com.bytedance.android.livesdk.watch.AbstractC11325d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11677a;
import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11678b;
import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11679c;
import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11685f;
import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11687h;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11633b;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11641e;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11642f;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11650h;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11655j;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11660n;
import com.bytedance.android.livesdkapi.depend.p680d.p681a.AbstractC11630b;
import com.bytedance.android.livesdkapi.depend.p680d.p682b.AbstractC11635b;
import com.bytedance.android.livesdkapi.depend.p680d.p682b.AbstractC11636c;
import com.bytedance.android.livesdkapi.depend.p680d.p682b.C11637d;
import com.bytedance.android.livesdkapi.depend.p683e.AbstractC11665b;
import com.bytedance.android.livesdkapi.depend.p683e.C11666c;
import com.bytedance.android.livesdkapi.model.C11838d;
import com.bytedance.android.livesdkapi.p674b.AbstractC11614d;
import com.bytedance.android.livesdkapi.p697j.AbstractC11821a;
import com.bytedance.android.livesdkapi.service.AbstractC11843a;
import com.bytedance.android.livesdkapi.service.AbstractC11844b;
import com.bytedance.android.livesdkapi.service.AbstractC11846d;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.AbstractC18293d;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.p2082ss.android.ugc.aweme.live.feedpage.LiveRoomInfoApi;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.live.ad */
public final class C58492ad implements AbstractC58593c {
    static {
        Covode.recordClassIndex(68783);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: b */
    public final void mo13016b(Activity activity) {
    }

    @Override // com.p2082ss.android.ugc.aweme.live.AbstractC58593c
    /* renamed from: z */
    public final void mo95862z() {
        Live.refreshLoginState();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.AbstractC58593c
    /* renamed from: a */
    public final boolean mo95860a() {
        return Live.openLiveRecord();
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final void mo12988a(Activity activity) {
        Live.getService().mo12988a(activity);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final void mo13002a(Locale locale) {
        Live.getService().mo13002a(locale);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final boolean mo13004a(Context context, Uri uri) {
        return Live.getService().mo13004a(context, uri);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final void mo13003a(Map<String, Class> map, Map<Class, AbstractC2724b> map2) {
        Live.getService().mo13003a(map, map2);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final AbstractC11685f mo12980a(AbstractC11821a aVar) {
        return Live.getService().mo12980a(aVar);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final void mo13001a(String str, AbstractC5777j jVar) {
        Live.getService().mo13001a(str, jVar);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final void mo12989a(Context context) {
        Live.getService().mo12989a(context);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final AbstractC11650h mo12978a(EnterRoomConfig enterRoomConfig) {
        return Live.getService().mo12978a(enterRoomConfig);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final AbstractC11679c mo12979a(AbstractC11678b bVar, Bundle bundle) {
        return Live.getService().mo12979a(bVar, bundle);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final void mo12987a(long j, AbstractC11844b bVar) {
        Live.getService().mo12987a(j, bVar);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final void mo12996a(AbstractC11636c cVar) {
        Live.getService().mo12996a(cVar);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final <T> T mo12981a(String str, T t) {
        AbstractC11846d service = Live.getService();
        return service == null ? t : (T) service.mo12981a(str, (Object) t);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final void mo12991a(Context context, C11666c cVar) {
        Live.getService().mo12991a(context, cVar);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final String mo12982a(long j, EnterRoomConfig enterRoomConfig, Context context) {
        return Live.getService().mo12982a(j, enterRoomConfig, context);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final boolean mo13006a(String str, Context context) {
        return Live.getService().mo13006a(str, context);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final void mo12997a(AbstractC11641e eVar) {
        Live.getService().mo12997a(eVar);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final void mo12985a(int i) {
        if (Live.getService() != null) {
            Live.getService().mo12985a(i);
        }
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final void mo12994a(Context context, boolean z, Room room, C11666c cVar, IHostLongPressCallback iHostLongPressCallback, AbstractC11665b bVar) {
        Live.getService().mo12994a(context, z, room, cVar, iHostLongPressCallback, bVar);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final void mo12992a(Context context, C11838d dVar) {
        Live.getService().mo12992a(context, dVar);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final void mo12993a(Context context, String str, String str2, Bundle bundle, DialogInterface.OnDismissListener onDismissListener) {
        Live.getService().mo12993a(context, str, str2, bundle, onDismissListener);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final Map<String, Object> mo12983a(long j) {
        return Live.getService().mo12983a(j);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final Map<String, AbstractC18293d> mo12984a(WeakReference<Context> weakReference, C18288a aVar) {
        return Live.getService().mo12984a(weakReference, aVar);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final void mo12998a(C11666c cVar) {
        Live.getService().mo12998a(cVar);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final void mo12999a(Room room, String str, String str2) {
        Live.getService().mo12999a(room, str, str2);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final void mo13000a(Room room, String str, String str2, String str3) {
        Live.getService().mo13000a(room, str, str2, str3);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final boolean mo13007a(String str, String str2) {
        return Live.getService().mo13007a(str, str2);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final boolean mo13005a(Context context, Uri uri, Map<String, String> map) {
        return Live.getService().mo13005a(context, uri, map);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final void mo12990a(Context context, int i) {
        Live.getService().mo12990a(context, i);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final void mo12995a(AbstractC7258b.EnumC7259a aVar, AbstractC7258b bVar) {
        Live.getService().mo12995a(aVar, bVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.AbstractC58593c
    /* renamed from: a */
    public final AbstractC88979t<NewLiveRoomStruct> mo95859a(long j, String str) {
        Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit("https://" + Live.getLiveDomain()).create(LiveRoomInfoApi.class);
        C89219l.m154716b(create, "");
        return ((LiveRoomInfoApi) create).fetchUserRoom(j, str).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143292d(C58494ae.f133170a);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: c */
    public final void mo13020c() {
        Live.getService().mo13020c();
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: e */
    public final void mo13023e() {
        Live.getService().mo13023e();
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: n */
    public final void mo13033n() {
        Live.getService().mo13033n();
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: t */
    public final void mo13039t() {
        Live.getService().mo13039t();
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: y */
    public final void mo13044y() {
        Live.getService().mo13044y();
    }

    /* renamed from: com.ss.android.ugc.aweme.live.ad$a */
    static class C58493a {

        /* renamed from: a */
        public static AbstractC58593c f133169a = new C58492ad();

        static {
            Covode.recordClassIndex(68784);
        }
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: d */
    public final Fragment mo13021d() {
        return Live.getService().mo13021d();
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: g */
    public final AbstractC11630b mo13026g() {
        return Live.getService().mo13026g();
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: h */
    public final Fragment mo13027h() {
        return Live.getService().mo13027h();
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: i */
    public final AbstractC11687h mo13028i() {
        return Live.getService().mo13028i();
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: k */
    public final Map<String, String> mo13030k() {
        return Live.getService().mo13030k();
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: l */
    public final int mo13031l() {
        return Live.getService().mo13031l();
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: m */
    public final int mo13032m() {
        return Live.getService().mo13032m();
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: o */
    public final AbstractC11660n mo13034o() {
        return Live.getService().mo13034o();
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: p */
    public final JSONObject mo13035p() {
        AbstractC11846d service = Live.getService();
        if (service == null) {
            return null;
        }
        return service.mo13035p();
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: q */
    public final String mo13036q() {
        return Live.getService().mo13036q();
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: r */
    public final AbstractC11642f mo13037r() {
        return Live.getService().mo13037r();
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: s */
    public final AbstractC11655j mo13038s() {
        return Live.getService().mo13038s();
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: u */
    public final AbstractC3054d mo13040u() {
        return Live.getService().mo13040u();
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: v */
    public final boolean mo13041v() {
        return Live.getService().mo13041v();
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: w */
    public final boolean mo13042w() {
        return Live.getService().mo13042w();
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: x */
    public final AbstractC4374a mo13043x() {
        return Live.getService().mo13043x();
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: f */
    public final AbstractC11643g mo13025f() {
        if (Live.getService() != null) {
            return Live.getService().mo13025f();
        }
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: j */
    public final Context mo13029j() {
        if (Live.getService() != null) {
            return Live.getService().mo13029j();
        }
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: b */
    public final AbstractC11322c mo13011b() {
        return Live.getService().mo13011b();
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: b */
    public final void mo13015b(long j) {
        Live.getService().mo13015b(j);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: d */
    public final void mo13022d(String str) {
        Live.getService().mo13022d(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.AbstractC58593c
    /* renamed from: f */
    public final boolean mo95861f(String str) {
        return Live.openLiveRecordBySchema(str);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: b */
    public final int mo13008b(String str) {
        return Live.getService().mo13008b(str);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: c */
    public final int mo13018c(String str) {
        return Live.getService().mo13018c(str);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: e */
    public final void mo13024e(String str) {
        Live.getService().mo13024e(str);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final AbstractC5776i mo12974a(Bundle bundle) {
        return Live.getService().mo12974a(bundle);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: b */
    public final AbstractC11614d mo13012b(Bundle bundle) {
        return Live.getService().mo13012b(bundle);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: b */
    public final String mo13014b(int i) {
        return Live.getService().mo13014b(i);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final AbstractC11643g mo12977a(String str) {
        if (Live.getService() != null) {
            return Live.getService().mo12977a(str);
        }
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: b */
    public final void mo13017b(C11666c cVar) {
        Live.getService().mo13017b(cVar);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final void mo12986a(long j, AbstractC11843a aVar) {
        Live.getService().mo12986a(j, aVar);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final Fragment mo12970a(Context context, Bundle bundle) {
        return Live.getService().mo12970a(context, bundle);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final Fragment mo12971a(Context context, String str) {
        return Live.getService().mo12971a(context, str);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: b */
    public final Fragment mo13009b(Context context, Bundle bundle) {
        return Live.getService().mo13009b(context, bundle);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: c */
    public final Fragment mo13019c(Context context, Bundle bundle) {
        return Live.getService().mo13019c(context, bundle);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final Fragment mo12972a(Uri uri, Context context) {
        return Live.getService().mo12972a(uri, context);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: b */
    public final AbstractC8220c mo13010b(Context context, Uri uri) {
        return Live.getService().mo13010b(context, uri);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final AbstractC11321b mo12975a(FullDraggableContainer fullDraggableContainer, Bundle bundle) {
        return ((AbstractC11325d) C6193a.m13435a(AbstractC11325d.class)).createDrawerFeedFragment(fullDraggableContainer, bundle);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: b */
    public final AbstractC11677a mo13013b(AbstractC11678b bVar, Bundle bundle) {
        return Live.getService().mo13013b(bVar, bundle);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final AbstractC11633b mo12976a(Context context, ViewGroup viewGroup) {
        return Live.getService().mo12976a(context, viewGroup);
    }

    @Override // com.bytedance.android.livesdkapi.service.AbstractC11846d
    /* renamed from: a */
    public final DialogInterface$OnCancelListenerC0944d mo12973a(ActivityC0945e eVar, AbstractC11635b bVar, Bundle bundle, C11637d dVar) {
        return Live.getService().mo12973a(eVar, bVar, bundle, dVar);
    }
}
