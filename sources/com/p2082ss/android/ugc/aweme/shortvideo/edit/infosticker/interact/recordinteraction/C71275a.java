package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.recordinteraction;

import android.text.TextUtils;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.p2082ss.android.ugc.aweme.sticker.panel.guide.ExtraParams;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.recordinteraction.a */
public final class C71275a implements MessageCenter.Listener {

    /* renamed from: a */
    public String f159738a = "";

    /* renamed from: b */
    public String f159739b = "";

    /* renamed from: c */
    public boolean f159740c = true;

    /* renamed from: d */
    public LinkedHashMap<String, List<NormalTrackTimeStamp>> f159741d = new LinkedHashMap<>();

    /* renamed from: e */
    public LinkedHashMap<String, ExtraParams> f159742e = new LinkedHashMap<>();

    /* renamed from: f */
    public int f159743f = 0;

    /* renamed from: g */
    public boolean f159744g = false;

    static {
        Covode.recordClassIndex(83794);
    }

    public C71275a() {
        MessageCenter.init();
        MessageCenter.addListener(this);
    }

    /* renamed from: a */
    public final void mo112704a(int i) {
        if (this.f159740c) {
            for (Map.Entry<String, List<NormalTrackTimeStamp>> entry : this.f159741d.entrySet()) {
                List<NormalTrackTimeStamp> value = entry.getValue();
                if (!C13603b.m24435a((Collection) value)) {
                    Iterator<NormalTrackTimeStamp> it = value.iterator();
                    while (it.hasNext()) {
                        if (it.next().getPts() > i) {
                            it.remove();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo112705a(int i, ExtraParams extraParams) {
        if (this.f159740c && !C13627m.m24498a(this.f159738a)) {
            ArrayList arrayList = new ArrayList();
            List<NormalTrackTimeStamp> list = this.f159741d.get(this.f159739b);
            if (!C13603b.m24435a((Collection) list)) {
                arrayList.addAll(list);
            }
            try {
                EffectLocationMessage effectLocationMessage = (EffectLocationMessage) C63238c.f143596w.getRetrofitFactoryGson().mo46670a(this.f159738a, EffectLocationMessage.class);
                if (!(effectLocationMessage == null || C13603b.m24435a((Collection) effectLocationMessage.locations))) {
                    LinkedList linkedList = new LinkedList();
                    for (EffectLocation effectLocation : effectLocationMessage.locations) {
                        NormalTrackTimeStamp normalTrackTimeStamp = new NormalTrackTimeStamp();
                        normalTrackTimeStamp.setPts(i);
                        normalTrackTimeStamp.setWidth(effectLocation.getW());
                        normalTrackTimeStamp.setHeight(effectLocation.getH());
                        normalTrackTimeStamp.setX(effectLocation.getX());
                        normalTrackTimeStamp.setY(effectLocation.getY());
                        normalTrackTimeStamp.setScale(Float.valueOf(1.0f));
                        normalTrackTimeStamp.setRotation(effectLocation.getR());
                        linkedList.add(normalTrackTimeStamp);
                    }
                    arrayList.addAll(linkedList);
                    this.f159741d.put(this.f159739b, arrayList);
                    this.f159742e.put(this.f159739b, extraParams);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.bef.effectsdk.message.MessageCenter.Listener
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        if (i == 28) {
            this.f159738a = str;
            if (!this.f159744g && !TextUtils.equals(str, "{\"locations\":[]}")) {
                this.f159744g = true;
            }
        }
    }
}
