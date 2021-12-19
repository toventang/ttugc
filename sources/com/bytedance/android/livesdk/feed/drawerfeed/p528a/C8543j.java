package com.bytedance.android.livesdk.feed.drawerfeed.p528a;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.chatroom.C7411d;
import com.bytedance.android.livesdk.feed.AbstractC8593h;
import com.bytedance.android.livesdk.feed.AbstractC8643m;
import com.bytedance.android.livesdk.feed.dislike.C8527a;
import com.bytedance.android.livesdk.feed.drawerfeed.C8555l;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.C11725f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p691g.AbstractC11767g;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import p4560f.p4561a.p4591l.C88960c;

/* renamed from: com.bytedance.android.livesdk.feed.drawerfeed.a.j */
public final class C8543j extends AbstractC8542i {

    /* renamed from: a */
    public static int f21117a = -1;

    /* renamed from: A */
    private ViewGroup f21118A;

    static {
        Covode.recordClassIndex(9398);
    }

    @Override // com.bytedance.android.livesdk.feed.p533i.AbstractC8610k
    /* renamed from: a */
    public final void mo14845a(ImageModel imageModel) {
        if (imageModel == null) {
            m16750a(0, 0);
        } else {
            m16750a(imageModel.width, imageModel.height);
        }
    }

    @Override // com.bytedance.android.livesdk.feed.p533i.AbstractC8610k
    /* renamed from: a */
    public final void mo14847a(FeedItem feedItem) {
        String str;
        String str2;
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        String str3 = this.f21248d.f21207b;
        if (str3.contains("live") && C8555l.f21172t != null) {
            this.f21251g = C8555l.f21172t;
            str3 = C8555l.f21172t.getEvent();
            enterRoomConfig.f28232b.f28267k = (long) this.f21251g.getSource();
        }
        enterRoomConfig.f28232b.f28269m = str3;
        enterRoomConfig.f28233c.f28307X = "live_small_picture";
        enterRoomConfig.f28232b.f28264h = str3;
        enterRoomConfig.f28232b.f28263g = feedItem.logPb;
        enterRoomConfig.f28232b.f28257a = feedItem.resId;
        if (this.f21251g != null) {
            enterRoomConfig.f28232b.f28267k = (long) this.f21251g.getSource();
        }
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.f28233c;
        if (C7411d.m15284a() != null) {
            str = C7411d.m15284a().mo13611b();
        } else {
            str = null;
        }
        roomsData.f28293J = str;
        EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.f28233c;
        if (C7411d.m15284a() != null) {
            str2 = C7411d.m15284a().mo13612c();
        } else {
            str2 = "drawer_cover";
        }
        roomsData2.f28295L = str2;
        if (feedItem.isRecommendCard) {
            enterRoomConfig.f28233c.f28293J = "pop_card";
        }
        if (C11725f.f28051c.booleanValue()) {
            HashMap<Long, String> hashMap = new HashMap<>();
            hashMap.put(Long.valueOf(feedItem.getRoom().getId()), feedItem.debugInfo);
            enterRoomConfig.f28233c.f28313aC = hashMap;
        }
        mo14844a(feedItem, enterRoomConfig);
    }

    @Override // com.bytedance.android.livesdk.feed.p533i.AbstractC8610k
    /* renamed from: a */
    public final void mo14846a(ImageModel imageModel, Room room) {
        m16750a(imageModel.getWidth(), imageModel.getHeight());
        super.mo14846a(imageModel, room);
    }

    /* renamed from: a */
    private void m16750a(int i, int i2) {
        int i3;
        if (f21117a <= 0) {
            f21117a = (this.f21118A.getMeasuredWidth() - 3) / 2;
        }
        if (i <= 0 || i2 <= 0) {
            i3 = f21117a;
        } else {
            i3 = (f21117a * i2) / i;
        }
        ViewGroup.LayoutParams layoutParams = this.f21278l.getLayoutParams();
        if (layoutParams.width != f21117a || layoutParams.height != i3) {
            layoutParams.width = f21117a;
            layoutParams.height = i3;
            this.f21278l.setLayoutParams(layoutParams);
        }
    }

    @Override // com.bytedance.android.livesdk.feed.p533i.AbstractC8597a, com.bytedance.android.livesdk.feed.p533i.AbstractC8610k
    /* renamed from: a */
    public final void mo14848a(FeedItem feedItem, Room room, int i) {
        super.mo14848a(feedItem, room, i);
    }

    public C8543j(View view, C8527a aVar, AbstractC8593h hVar, FeedDataKey feedDataKey, AbstractC8643m mVar, AbstractC11767g gVar, C88960c<FeedItem> cVar, C88960c<Boolean> cVar2, C88960c<Object> cVar3, C88960c<Object> cVar4, ViewGroup viewGroup) {
        super(view, aVar, hVar, feedDataKey, mVar, gVar, cVar, cVar2, cVar3, cVar4);
        this.f21118A = viewGroup;
        if (feedDataKey.f21207b.equals("live")) {
            this.f21251g = C8555l.f21172t;
        } else {
            this.f21251g = mVar.mo14949a(feedDataKey.f21208c);
        }
    }
}
