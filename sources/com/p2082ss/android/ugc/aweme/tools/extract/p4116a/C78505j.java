package com.p2082ss.android.ugc.aweme.tools.extract.p4116a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.tools.extract.C78595z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.a.j */
public final class C78505j implements Serializable {

    /* renamed from: a */
    private boolean f176410a;

    /* renamed from: b */
    private boolean f176411b;

    /* renamed from: c */
    private boolean f176412c;

    /* renamed from: d */
    private int f176413d = -1;

    /* renamed from: e */
    private List<Integer> f176414e = C89086z.INSTANCE;

    /* renamed from: f */
    private int f176415f = -1;

    /* renamed from: g */
    private int f176416g = -1;

    /* renamed from: h */
    private String f176417h;

    /* renamed from: i */
    private List<C78595z> f176418i = new ArrayList();

    /* renamed from: j */
    private boolean f176419j;

    /* renamed from: k */
    private long f176420k;

    /* renamed from: l */
    private long f176421l;

    static {
        Covode.recordClassIndex(91637);
    }

    public final int getAwemeType() {
        return this.f176415f;
    }

    public final boolean getCheckAudioFrame() {
        return this.f176411b;
    }

    public final boolean getCheckImageFrame() {
        return this.f176412c;
    }

    public final boolean getCheckVideoFrame() {
        return this.f176410a;
    }

    public final String getContentType() {
        return this.f176417h;
    }

    public final long getEndTime() {
        return this.f176421l;
    }

    public final List<Integer> getPhotoDurationList() {
        return this.f176414e;
    }

    public final long getStartTime() {
        return this.f176420k;
    }

    public final List<C78595z> getUploadFrameInfoList() {
        return this.f176418i;
    }

    public final int getVideoOrigin() {
        return this.f176413d;
    }

    public final int getVideoType() {
        return this.f176416g;
    }

    public final boolean isGreenDuet() {
        return this.f176419j;
    }

    public final String toJSONString() {
        int i;
        int i2;
        try {
            JSONObject jSONObject = new JSONObject();
            int i3 = 0;
            if (this.f176410a) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("video_check", i);
            if (this.f176411b) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            jSONObject.put("audio_check", i2);
            if (!this.f176414e.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                Iterator<T> it = this.f176414e.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().intValue());
                }
                jSONObject.put("photo_time", jSONArray.toString());
            }
            jSONObject.put("video_type", this.f176416g);
            jSONObject.put("content_type", this.f176417h);
            jSONObject.put("origin", this.f176413d);
            jSONObject.put("aweme_type", this.f176415f);
            if (this.f176419j) {
                i3 = 1;
            }
            jSONObject.put("is_greenscreen_duet", i3);
            return jSONObject.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final void setAwemeType(int i) {
        this.f176415f = i;
    }

    public final void setCheckAudioFrame(boolean z) {
        this.f176411b = z;
    }

    public final void setCheckImageFrame(boolean z) {
        this.f176412c = z;
    }

    public final void setCheckVideoFrame(boolean z) {
        this.f176410a = z;
    }

    public final void setContentType(String str) {
        this.f176417h = str;
    }

    public final void setEndTime(long j) {
        this.f176421l = j;
    }

    public final void setGreenDuet(boolean z) {
        this.f176419j = z;
    }

    public final void setStartTime(long j) {
        this.f176420k = j;
    }

    public final void setVideoOrigin(int i) {
        this.f176413d = i;
    }

    public final void setVideoType(int i) {
        this.f176416g = i;
    }

    public final void setPhotoDurationList(List<Integer> list) {
        C89219l.m154721d(list, "");
        this.f176414e = list;
    }

    public final void setUploadFrameInfoList(List<C78595z> list) {
        C89219l.m154721d(list, "");
        this.f176418i = list;
    }
}
