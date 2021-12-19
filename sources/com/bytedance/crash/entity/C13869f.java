package com.bytedance.crash.entity;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.entity.f */
public final class C13869f {

    /* renamed from: a */
    public int f33767a;

    /* renamed from: b */
    public int f33768b;

    /* renamed from: c */
    public long f33769c;

    /* renamed from: d */
    public long f33770d;

    /* renamed from: e */
    public long f33771e;

    /* renamed from: f */
    public boolean f33772f;

    /* renamed from: g */
    public String f33773g;

    /* renamed from: h */
    public String f33774h;

    /* renamed from: i */
    public String f33775i;

    /* renamed from: j */
    public String f33776j;

    static {
        Covode.recordClassIndex(15928);
    }

    /* renamed from: a */
    public final JSONObject mo22353a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("msg", this.f33773g);
            jSONObject.put("cpuDuration", this.f33771e);
            jSONObject.put("duration", this.f33770d);
            jSONObject.put("tick", this.f33769c);
            jSONObject.put(StringSet.type, this.f33768b);
            jSONObject.put("count", this.f33767a);
            String str = this.f33774h;
            if (str != null) {
                jSONObject.put("block_stack", str);
                jSONObject.put("block_uuid", this.f33776j);
            }
            String str2 = this.f33775i;
            if (str2 != null) {
                jSONObject.put("sblock_stack", str2);
                jSONObject.put("sblock_uuid", this.f33776j);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public final String toString() {
        int i = this.f33768b;
        if (i == 0) {
            return "[[[ IDLE  ]]] cost " + this.f33769c + " tick , mDuration：" + this.f33770d + ",cpuTime:" + this.f33771e;
        }
        if (i == 1) {
            return "[[[ Long IDLE  ]]] cost " + this.f33769c + " tick , mDuration：" + this.f33770d + ",cpuTime:" + this.f33771e;
        }
        if (i == 2) {
            return "[[[  1 msg  ]]] cost " + this.f33769c + " tick , mDuration：" + this.f33770d + ",cpuTime:" + this.f33771e + ", msg:" + this.f33773g;
        }
        if (i == 3) {
            return "[[[ 1 msg + IDLE  ]]] cost " + this.f33769c + " tick , mDuration：" + this.f33770d + ",cpuTime:" + this.f33771e;
        }
        if (i == 4) {
            return "[[[ " + (this.f33767a - 1) + " msgs  ]]] cost less than 1 tick, [[[  last msg ]]] cost more than " + (this.f33769c - 1) + "tick ,, mDuration：" + this.f33770d + "cpuTime:" + this.f33771e + " msg:" + this.f33773g;
        }
        if (i == 5) {
            return "[[[ " + this.f33767a + " msgs ]]] cost less than 1 tick but [[[  IDLE ]]] cost more than" + (this.f33769c - 1) + " ticks, , mDuration：" + this.f33770d + "cpuTime:" + this.f33771e;
        }
        if (i == 6) {
            return "[[[  1 msg  ]]] cost less than 1 tick , but [[[  IDLE ]]] cost more than" + (this.f33769c - 1) + ", , mDuration：" + this.f33770d + "cpuTime:" + this.f33771e;
        }
        if (i == 7) {
            return "[[[ " + this.f33767a + " msgs + IDLE  ]]] cost 1 tick , mDuration：" + this.f33770d + " cost cpuTime:" + this.f33771e;
        }
        if (i == 8) {
            return "[[[ 1 msgs ]]] cost " + this.f33769c + " ticks , mDuration：" + this.f33770d + " cost cpuTime:" + this.f33771e + " msg:" + this.f33773g;
        }
        if (i == 9) {
            return "[[[ " + this.f33767a + " msgs ]]] cost 1 tick , mDuration：" + this.f33770d + " cost cpuTime:" + this.f33771e;
        }
        return "=========   UNKNOW =========  Type:" + this.f33768b + " cost ticks " + this.f33769c + " msgs:" + this.f33767a;
    }
}
