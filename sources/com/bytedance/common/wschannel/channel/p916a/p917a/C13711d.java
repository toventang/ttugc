package com.bytedance.common.wschannel.channel.p916a.p917a;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.common.wschannel.channel.p916a.p917a.C13677b;
import com.bytedance.common.wschannel.p920d.C13742c;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.io.UnsupportedEncodingException;
import okhttp3.C90029ac;
import org.json.JSONObject;
import p4632k.C89427i;

/* renamed from: com.bytedance.common.wschannel.channel.a.a.d */
final class C13711d implements C13677b.AbstractC13695d {

    /* renamed from: a */
    private final IWsChannelClient f33334a;

    /* renamed from: b */
    private final C13677b f33335b;

    /* renamed from: c */
    private final Context f33336c;

    static {
        Covode.recordClassIndex(15745);
    }

    @Override // com.bytedance.common.wschannel.channel.p916a.p917a.C13677b.AbstractC13695d
    /* renamed from: a */
    public final void mo22028a(C89427i iVar) {
        IWsChannelClient iWsChannelClient = this.f33334a;
        if (iWsChannelClient != null) {
            iWsChannelClient.onMessage(iVar.toByteArray());
        }
    }

    @Override // com.bytedance.common.wschannel.channel.p916a.p917a.C13677b.AbstractC13695d
    /* renamed from: c */
    public final void mo22031c(String str) {
        IWsChannelClient iWsChannelClient = this.f33334a;
        if (iWsChannelClient != null) {
            try {
                iWsChannelClient.onMessage(str.getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.bytedance.common.wschannel.channel.p916a.p917a.C13677b.AbstractC13695d
    /* renamed from: a */
    public final void mo22026a(String str) {
        if (this.f33334a != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(StringSet.type, 1);
                jSONObject.put("state", 1);
                jSONObject.put("url", str);
                jSONObject.put("channel_type", 2);
                this.f33334a.onConnection(jSONObject);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.bytedance.common.wschannel.channel.p916a.p917a.C13677b.AbstractC13695d
    /* renamed from: b */
    public final void mo22030b(String str) {
        if (this.f33334a != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(StringSet.type, 0);
                jSONObject.put("state", 3);
                jSONObject.put("url", str);
                jSONObject.put("channel_type", 2);
                this.f33334a.onConnection(jSONObject);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.bytedance.common.wschannel.channel.p916a.p917a.C13677b.AbstractC13695d
    /* renamed from: a */
    public final void mo22029a(C90029ac acVar) {
        if (this.f33334a != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(StringSet.type, 1);
                jSONObject.put("state", 4);
                jSONObject.put("url", acVar.f204105a.url().toString());
                jSONObject.put("channel_type", 2);
                this.f33334a.onConnection(jSONObject);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    C13711d(Context context, C13677b bVar, IWsChannelClient iWsChannelClient) {
        this.f33335b = bVar;
        this.f33334a = iWsChannelClient;
        this.f33336c = context;
    }

    @Override // com.bytedance.common.wschannel.channel.p916a.p917a.C13677b.AbstractC13695d
    /* renamed from: a */
    public final void mo22027a(String str, int i, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("url", str);
        bundle.putInt("error_code", i);
        bundle.putString("error_msg", str2);
        bundle.putString("method", "onFailure");
        C13742c.m24769a(this.f33336c, "WsChannelSdk_ok", bundle);
        if (this.f33334a != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(StringSet.type, 0);
                jSONObject.put("state", 2);
                jSONObject.put("url", str);
                jSONObject.put("channel_type", 2);
                jSONObject.put("error", str2);
                jSONObject.put("error_code", i);
                this.f33334a.onConnection(jSONObject);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
