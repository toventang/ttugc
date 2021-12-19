package com.bytedance.android.livesdk.feed.p533i;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.p218f.C3951p;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.p218f.p219a.C3898g;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.feed.AbstractC8593h;
import com.bytedance.android.livesdk.feed.AbstractC8643m;
import com.bytedance.android.livesdk.feed.C8687t;
import com.bytedance.android.livesdk.feed.dislike.C8527a;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.p530f.AbstractC8567a;
import com.bytedance.android.livesdk.feed.p534j.C8633a;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p691g.AbstractC11767g;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p4560f.p4561a.p4591l.C88960c;

/* renamed from: com.bytedance.android.livesdk.feed.i.k */
public abstract class AbstractC8610k extends AbstractC8597a {

    /* renamed from: k */
    TextView f21277k;

    /* renamed from: l */
    protected HSImageView f21278l;

    /* renamed from: m */
    HSImageView f21279m;

    /* renamed from: n */
    View f21280n;

    /* renamed from: o */
    LiveTextView f21281o;

    /* renamed from: p */
    HSImageView f21282p;

    /* renamed from: q */
    TextView f21283q;

    /* renamed from: r */
    protected View f21284r;

    /* renamed from: s */
    ImageView f21285s;

    /* renamed from: t */
    View f21286t;

    /* renamed from: u */
    TextView f21287u;

    /* renamed from: v */
    String f21288v = C3966y.m9657a((int) R.string.gkw);

    /* renamed from: w */
    C8687t f21289w;

    /* renamed from: x */
    View f21290x;

    /* renamed from: y */
    View f21291y;

    static {
        Covode.recordClassIndex(9467);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14845a(ImageModel imageModel) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo14847a(FeedItem feedItem);

    /* renamed from: a */
    private static void m16858a(View view, int i) {
        if (view != null) {
            view.setVisibility(i);
        }
    }

    /* renamed from: a */
    private void m16859a(final HSImageView hSImageView, ImageModel imageModel) {
        if (imageModel == null || C13617h.m24465a(imageModel.getUrls())) {
            hSImageView.setVisibility(8);
            return;
        }
        hSImageView.setVisibility(0);
        C3941k.m9603a(hSImageView, imageModel, new C3951p.AbstractC3953a() {
            /* class com.bytedance.android.livesdk.feed.p533i.AbstractC8610k.C86122 */

            static {
                Covode.recordClassIndex(9469);
            }

            @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
            /* renamed from: a */
            public final void mo9301a(ImageModel imageModel) {
            }

            @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
            /* renamed from: a */
            public final void mo9303a(ImageModel imageModel, Exception exc) {
            }

            @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
            /* renamed from: a */
            public final void mo9302a(ImageModel imageModel, int i, int i2) {
                ViewGroup.LayoutParams layoutParams = hSImageView.getLayoutParams();
                layoutParams.width = (int) (((float) layoutParams.height) * (((float) i) / ((float) i2)));
                hSImageView.setLayoutParams(layoutParams);
            }
        }, imageModel.isAnimated());
    }

    /* renamed from: a */
    public void mo14846a(ImageModel imageModel, final Room room) {
        final String str;
        final long[] jArr = new long[1];
        if (AbstractC8567a.f21172t != null) {
            str = AbstractC8567a.f21172t.getEvent();
        } else {
            str = "live_live";
        }
        this.f21289w = new C8687t();
        C3941k.C3944a aVar = new C3941k.C3944a(imageModel);
        aVar.f10843i = true;
        aVar.f10842h = false;
        aVar.f10837c = 300;
        aVar.f10841g = new C3951p.AbstractC3953a() {
            /* class com.bytedance.android.livesdk.feed.p533i.AbstractC8610k.C86111 */

            static {
                Covode.recordClassIndex(9468);
            }

            @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
            /* renamed from: a */
            public final void mo9301a(ImageModel imageModel) {
                jArr[0] = SystemClock.currentThreadTimeMillis();
                HashMap hashMap = new HashMap();
                hashMap.put("enter_from_merge", "live_merge");
                hashMap.put("enter_method", "live_cover");
                hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                hashMap.put("request_id", room.getRequestId());
                hashMap.put("room_id", String.valueOf(room.getId()));
                hashMap.put("event_belong", "live_view");
                hashMap.put("event_page", "live");
                hashMap.put("event_type", "core");
                hashMap.put("event_module", str);
                C6501b.C6502a.m13948a("live_cover_show_start").mo12652a((Map<String, String>) hashMap).mo12655b();
                AbstractC8610k.this.f21289w.f21438b = SystemClock.uptimeMillis();
            }

            @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
            /* renamed from: a */
            public final void mo9303a(ImageModel imageModel, Exception exc) {
                HashMap hashMap = new HashMap();
                hashMap.put("enter_from_merge", "live_merge");
                hashMap.put("enter_method", "live_cover");
                hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                hashMap.put("request_id", room.getRequestId());
                hashMap.put("room_id", String.valueOf(room.getId()));
                hashMap.put("is_success", "0");
                hashMap.put("time", String.valueOf(SystemClock.currentThreadTimeMillis() - jArr[0]));
                hashMap.put("event_belong", "live_view");
                hashMap.put("event_page", "live");
                hashMap.put("event_type", "core");
                hashMap.put("event_module", str);
                C6501b.C6502a.m13948a("live_cover_show_finish").mo12652a((Map<String, String>) hashMap).mo12655b();
                C8687t tVar = AbstractC8610k.this.f21289w;
                String uri = imageModel.getUri();
                tVar.mo14967a();
                JSONObject jSONObject = new JSONObject();
                String message = exc.getMessage();
                C8687t.m9474a(jSONObject, "error_code", 0L);
                C8687t.m9475a(jSONObject, "error_msg", message);
                C8687t.m9475a(jSONObject, "url", uri);
                C3868c.m9497b("ttlive_feed_image_load_all", 1, jSONObject);
                C3868c.m9492a("ttlive_feed_image_load_error", 1, jSONObject);
            }

            @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
            /* renamed from: a */
            public final void mo9302a(ImageModel imageModel, int i, int i2) {
                String uri;
                HashMap hashMap = new HashMap();
                hashMap.put("enter_from_merge", "live_merge");
                hashMap.put("enter_method", "live_cover");
                hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                hashMap.put("request_id", room.getRequestId());
                hashMap.put("room_id", String.valueOf(room.getId()));
                hashMap.put("is_success", "1");
                hashMap.put("time", String.valueOf(SystemClock.currentThreadTimeMillis() - jArr[0]));
                hashMap.put("event_belong", "live_view");
                hashMap.put("event_page", "live");
                hashMap.put("event_type", "core");
                hashMap.put("event_module", str);
                C6501b.C6502a.m13948a("live_cover_show_finish").mo12652a((Map<String, String>) hashMap).mo12655b();
                C8687t tVar = AbstractC8610k.this.f21289w;
                if (imageModel == null) {
                    uri = "";
                } else {
                    uri = imageModel.getUri();
                }
                long a = tVar.mo14967a();
                JSONObject jSONObject = new JSONObject();
                C8687t.m9475a(jSONObject, "url", uri);
                C3868c.m9490a("ttlive_feed_image_load_all", 0, a, jSONObject);
            }
        };
        C3941k.m9608a(this.f21278l, aVar.f10835a, aVar.f10836b, aVar.f10838d, aVar.f10839e, aVar.f10840f, aVar.f10841g, aVar.f10842h, aVar.f10843i);
        C3898g a = C3898g.m9526a();
        List<String> urls = imageModel.getUrls();
        if (urls != null) {
            for (String str2 : urls) {
                a.f10794a.put(str2, 2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo14916a(FeedItem feedItem, Room room, View view) {
        mo14847a(feedItem);
        C8633a b = C8633a.m16888b();
        if (room != null && view != null) {
            JSONObject jSONObject = new JSONObject();
            User owner = room.getOwner();
            if (owner != null) {
                String title = room.title();
                String nickName = owner.getNickName();
                try {
                    jSONObject.put("title", title);
                    jSONObject.put("nickName", nickName);
                    jSONObject.put("action", "View#onClick()");
                    jSONObject.put("className", view.getClass().getName());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                b.mo9216a("ttlive_page", jSONObject);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0133  */
    @Override // com.bytedance.android.livesdk.feed.p533i.AbstractC8597a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14848a(com.bytedance.android.livesdk.model.FeedItem r11, com.bytedance.android.livesdkapi.depend.model.live.Room r12, int r13) {
        /*
        // Method dump skipped, instructions count: 392
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.feed.p533i.AbstractC8610k.mo14848a(com.bytedance.android.livesdk.model.FeedItem, com.bytedance.android.livesdkapi.depend.model.live.Room, int):void");
    }

    public AbstractC8610k(View view, C8527a aVar, AbstractC8593h hVar, FeedDataKey feedDataKey, AbstractC8643m mVar, AbstractC11767g gVar, C88960c<FeedItem> cVar, C88960c<Boolean> cVar2, C88960c<Object> cVar3, C88960c<Object> cVar4) {
        super(view, aVar, hVar, feedDataKey, mVar, gVar, cVar, cVar2, cVar3, cVar4);
        this.f21290x = view.findViewById(R.id.cih);
        this.f21291y = view.findViewById(R.id.ciq);
        this.f21277k = (TextView) view.findViewById(R.id.title);
        this.f21278l = (HSImageView) view.findViewById(R.id.ca_);
        this.f21279m = (HSImageView) view.findViewById(R.id.cbl);
        this.f21280n = view.findViewById(R.id.c7w);
        this.f21281o = (LiveTextView) view.findViewById(R.id.c7y);
        this.f21282p = (HSImageView) view.findViewById(R.id.c7x);
        this.f21283q = (TextView) view.findViewById(R.id.md);
        this.f21284r = view.findViewById(R.id.bxj);
        this.f21285s = (ImageView) view.findViewById(R.id.cc1);
        this.f21286t = view.findViewById(R.id.cbv);
        this.f21287u = (TextView) view.findViewById(R.id.cbu);
    }
}
