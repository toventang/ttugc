package com.bytedance.android.livesdkapi.service;

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
import com.bytedance.android.livesdk.callback.AbstractC7258b;
import com.bytedance.android.livesdk.callback.IHostLongPressCallback;
import com.bytedance.android.livesdk.container.AbstractC8220c;
import com.bytedance.android.livesdk.feed.FullDraggableContainer;
import com.bytedance.android.livesdk.watch.AbstractC11321b;
import com.bytedance.android.livesdk.watch.AbstractC11322c;
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
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.AbstractC18293d;
import com.bytedance.ies.web.p1285a.C18288a;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdkapi.service.d */
public interface AbstractC11846d {
    static {
        Covode.recordClassIndex(13553);
    }

    /* renamed from: a */
    Fragment mo12970a(Context context, Bundle bundle);

    /* renamed from: a */
    Fragment mo12971a(Context context, String str);

    /* renamed from: a */
    Fragment mo12972a(Uri uri, Context context);

    /* renamed from: a */
    DialogInterface$OnCancelListenerC0944d mo12973a(ActivityC0945e eVar, AbstractC11635b bVar, Bundle bundle, C11637d dVar);

    /* renamed from: a */
    AbstractC5776i mo12974a(Bundle bundle);

    /* renamed from: a */
    AbstractC11321b mo12975a(FullDraggableContainer fullDraggableContainer, Bundle bundle);

    /* renamed from: a */
    AbstractC11633b mo12976a(Context context, ViewGroup viewGroup);

    /* renamed from: a */
    AbstractC11643g mo12977a(String str);

    /* renamed from: a */
    AbstractC11650h mo12978a(EnterRoomConfig enterRoomConfig);

    /* renamed from: a */
    AbstractC11679c mo12979a(AbstractC11678b bVar, Bundle bundle);

    /* renamed from: a */
    AbstractC11685f mo12980a(AbstractC11821a aVar);

    /* renamed from: a */
    <T> T mo12981a(String str, T t);

    /* renamed from: a */
    String mo12982a(long j, EnterRoomConfig enterRoomConfig, Context context);

    /* renamed from: a */
    Map<String, Object> mo12983a(long j);

    /* renamed from: a */
    Map<String, AbstractC18293d> mo12984a(WeakReference<Context> weakReference, C18288a aVar);

    /* renamed from: a */
    void mo12985a(int i);

    /* renamed from: a */
    void mo12986a(long j, AbstractC11843a aVar);

    /* renamed from: a */
    void mo12987a(long j, AbstractC11844b bVar);

    /* renamed from: a */
    void mo12988a(Activity activity);

    /* renamed from: a */
    void mo12989a(Context context);

    /* renamed from: a */
    void mo12990a(Context context, int i);

    /* renamed from: a */
    void mo12991a(Context context, C11666c cVar);

    /* renamed from: a */
    void mo12992a(Context context, C11838d dVar);

    /* renamed from: a */
    void mo12993a(Context context, String str, String str2, Bundle bundle, DialogInterface.OnDismissListener onDismissListener);

    /* renamed from: a */
    void mo12994a(Context context, boolean z, Room room, C11666c cVar, IHostLongPressCallback iHostLongPressCallback, AbstractC11665b bVar);

    /* renamed from: a */
    void mo12995a(AbstractC7258b.EnumC7259a aVar, AbstractC7258b bVar);

    /* renamed from: a */
    void mo12996a(AbstractC11636c cVar);

    /* renamed from: a */
    void mo12997a(AbstractC11641e eVar);

    /* renamed from: a */
    void mo12998a(C11666c cVar);

    /* renamed from: a */
    void mo12999a(Room room, String str, String str2);

    /* renamed from: a */
    void mo13000a(Room room, String str, String str2, String str3);

    /* renamed from: a */
    void mo13001a(String str, AbstractC5777j jVar);

    /* renamed from: a */
    void mo13002a(Locale locale);

    /* renamed from: a */
    void mo13003a(Map<String, Class> map, Map<Class, AbstractC2724b> map2);

    /* renamed from: a */
    boolean mo13004a(Context context, Uri uri);

    /* renamed from: a */
    boolean mo13005a(Context context, Uri uri, Map<String, String> map);

    /* renamed from: a */
    boolean mo13006a(String str, Context context);

    /* renamed from: a */
    boolean mo13007a(String str, String str2);

    /* renamed from: b */
    int mo13008b(String str);

    /* renamed from: b */
    Fragment mo13009b(Context context, Bundle bundle);

    /* renamed from: b */
    AbstractC8220c mo13010b(Context context, Uri uri);

    /* renamed from: b */
    AbstractC11322c mo13011b();

    /* renamed from: b */
    AbstractC11614d mo13012b(Bundle bundle);

    /* renamed from: b */
    AbstractC11677a mo13013b(AbstractC11678b bVar, Bundle bundle);

    /* renamed from: b */
    String mo13014b(int i);

    /* renamed from: b */
    void mo13015b(long j);

    /* renamed from: b */
    void mo13016b(Activity activity);

    /* renamed from: b */
    void mo13017b(C11666c cVar);

    /* renamed from: c */
    int mo13018c(String str);

    /* renamed from: c */
    Fragment mo13019c(Context context, Bundle bundle);

    /* renamed from: c */
    void mo13020c();

    /* renamed from: d */
    Fragment mo13021d();

    /* renamed from: d */
    void mo13022d(String str);

    /* renamed from: e */
    void mo13023e();

    /* renamed from: e */
    void mo13024e(String str);

    /* renamed from: f */
    AbstractC11643g mo13025f();

    /* renamed from: g */
    AbstractC11630b mo13026g();

    /* renamed from: h */
    Fragment mo13027h();

    /* renamed from: i */
    AbstractC11687h mo13028i();

    /* renamed from: j */
    Context mo13029j();

    /* renamed from: k */
    Map<String, String> mo13030k();

    /* renamed from: l */
    int mo13031l();

    /* renamed from: m */
    int mo13032m();

    /* renamed from: n */
    void mo13033n();

    /* renamed from: o */
    AbstractC11660n mo13034o();

    /* renamed from: p */
    JSONObject mo13035p();

    /* renamed from: q */
    String mo13036q();

    /* renamed from: r */
    AbstractC11642f mo13037r();

    /* renamed from: s */
    AbstractC11655j mo13038s();

    /* renamed from: t */
    void mo13039t();

    /* renamed from: u */
    AbstractC3054d mo13040u();

    /* renamed from: v */
    boolean mo13041v();

    /* renamed from: w */
    boolean mo13042w();

    /* renamed from: x */
    AbstractC4374a mo13043x();

    /* renamed from: y */
    void mo13044y();
}
