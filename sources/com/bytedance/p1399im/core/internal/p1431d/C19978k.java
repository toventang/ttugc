package com.bytedance.p1399im.core.internal.p1431d;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19945z;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1404a.C19489e;
import com.bytedance.p1399im.core.p1408d.C19608bd;
import com.bytedance.p1399im.core.proto.IMCMD;
import com.bytedance.p1399im.core.proto.Request;
import com.bytedance.p1399im.core.proto.Response;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.im.core.internal.d.k */
public final class C19978k implements AbstractC19968d, Comparable<C19978k> {

    /* renamed from: a */
    public long f47477a;

    /* renamed from: b */
    public boolean f47478b;

    /* renamed from: c */
    public AbstractC19977j f47479c;

    /* renamed from: d */
    public Object[] f47480d;

    /* renamed from: e */
    public Request f47481e;

    /* renamed from: f */
    public Response f47482f;

    /* renamed from: g */
    public C19608bd f47483g;

    /* renamed from: h */
    public AbstractC19927w f47484h;

    /* renamed from: i */
    public int f47485i;

    /* renamed from: j */
    public long f47486j = SystemClock.uptimeMillis();

    /* renamed from: k */
    public long f47487k;

    /* renamed from: l */
    public int f47488l;

    /* renamed from: m */
    public int f47489m;

    /* renamed from: n */
    public boolean f47490n;

    /* renamed from: o */
    public int f47491o;

    /* renamed from: p */
    public int f47492p;

    /* renamed from: q */
    public long f47493q;

    /* renamed from: r */
    public long f47494r;

    /* renamed from: s */
    public String f47495s;

    /* renamed from: t */
    public long f47496t;

    /* renamed from: u */
    public volatile AbstractC19945z f47497u;

    static {
        Covode.recordClassIndex(22822);
    }

    @Override // com.bytedance.p1399im.core.internal.p1431d.AbstractC19968d
    /* renamed from: a */
    public final int mo31852a() {
        return this.f47485i;
    }

    @Override // com.bytedance.p1399im.core.internal.p1431d.AbstractC19968d
    /* renamed from: g */
    public final String mo31858g() {
        return this.f47495s;
    }

    /* renamed from: i */
    public final long mo31866i() {
        return this.f47494r - this.f47493q;
    }

    @Override // com.bytedance.p1399im.core.internal.p1431d.AbstractC19968d
    /* renamed from: f */
    public final String mo31857f() {
        Response response = this.f47482f;
        if (response == null) {
            return "";
        }
        return response.log_id;
    }

    /* renamed from: h */
    public final int mo31865h() {
        int i = this.f47491o;
        if (i > 0) {
            return i;
        }
        return C19483d.m36365a().mo31141b().f46274n;
    }

    /* renamed from: j */
    public final boolean mo31867j() {
        if (this.f47488l > 0 || this.f47489m > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final String mo31870m() {
        Response response = this.f47482f;
        if (response != null) {
            return response.error_desc;
        }
        return "";
    }

    /* renamed from: k */
    public final int mo31868k() {
        Request request = this.f47481e;
        if (request == null || request.cmd == null) {
            return IMCMD.IMCMD_NOT_USED.getValue();
        }
        return this.f47481e.cmd.intValue();
    }

    /* renamed from: l */
    public final boolean mo31869l() {
        Response response = this.f47482f;
        if (response == null || response.status_code == null) {
            return false;
        }
        if (this.f47482f.status_code.intValue() == C19489e.AbstractC19491b.f46184a || this.f47482f.status_code.intValue() == 200) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public final String mo31871n() {
        Request request = this.f47481e;
        if (request == null || request.cmd == null || IMCMD.fromValue(this.f47481e.cmd.intValue()) != IMCMD.SEND_MESSAGE || this.f47481e.body == null || this.f47481e.body.send_message_body == null) {
            return "";
        }
        return this.f47481e.body.send_message_body.client_message_id;
    }

    public final String toString() {
        return "RequestItem[cmd:" + mo31868k() + ", seqId:" + this.f47477a + "]";
    }

    @Override // com.bytedance.p1399im.core.internal.p1431d.AbstractC19968d
    /* renamed from: c */
    public final String mo31854c() {
        try {
            IMCMD fromValue = IMCMD.fromValue(this.f47481e.cmd.intValue());
            if (fromValue == null) {
                return "";
            }
            if (fromValue == IMCMD.SEND_MESSAGE) {
                return this.f47482f.body.send_message_body.extra_info;
            }
            if (fromValue == IMCMD.CREATE_CONVERSATION_V2) {
                return this.f47482f.body.create_conversation_v2_body.extra_info;
            }
            if (fromValue == IMCMD.ADD_CONVERSATION_PARTICIPANTS) {
                return this.f47482f.body.conversation_add_participants_body.extra_info;
            }
            if (fromValue == IMCMD.REMOVE_CONVERSATION_PARTICIPANTS) {
                return this.f47482f.body.conversation_remove_participants_body.extra_info;
            }
            if (fromValue == IMCMD.UPDATE_CONVERSATION_PARTICIPANT) {
                return this.f47482f.body.update_conversation_participant_body.extra_info;
            }
            if (fromValue == IMCMD.SET_CONVERSATION_CORE_INFO) {
                return this.f47482f.body.set_conversation_core_info_body.extra_info;
            }
            if (fromValue == IMCMD.UPSERT_CONVERSATION_CORE_EXT_INFO) {
                return this.f47482f.body.upsert_conversation_core_ext_info_body.extra_info;
            }
            if (fromValue == IMCMD.SET_CONVERSATION_SETTING_INFO) {
                return this.f47482f.body.set_conversation_setting_info_body.extra_info;
            }
            if (fromValue == IMCMD.UPSERT_CONVERSATION_SETTING_EXT_INFO) {
                return this.f47482f.body.upsert_conversation_setting_ext_info_body.extra_info;
            }
            if (fromValue == IMCMD.CALL_VOIP) {
                String str = (String) m37687a("extra_info", this.f47482f.body.getExtension(IMCMD.CALL_VOIP.getValue()));
                if (!TextUtils.isEmpty(str)) {
                    return str;
                }
            } else if (fromValue == IMCMD.BROADCAST_SEND_MESSAGE) {
                String str2 = (String) m37687a("extra_info", this.f47482f.body.getExtension(IMCMD.BROADCAST_SEND_MESSAGE.getValue()));
                if (!TextUtils.isEmpty(str2)) {
                    return str2;
                }
            }
            return "";
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.p1399im.core.internal.p1431d.AbstractC19968d
    /* renamed from: b */
    public final int mo31853b() {
        Integer num;
        try {
            IMCMD fromValue = IMCMD.fromValue(this.f47481e.cmd.intValue());
            if (fromValue == null) {
                return C19489e.AbstractC19491b.f46184a;
            }
            if (fromValue == IMCMD.SEND_MESSAGE) {
                return this.f47482f.body.send_message_body.status.intValue();
            }
            if (fromValue == IMCMD.CREATE_CONVERSATION_V2) {
                return this.f47482f.body.create_conversation_v2_body.status.intValue();
            }
            if (fromValue == IMCMD.ADD_CONVERSATION_PARTICIPANTS) {
                return this.f47482f.body.conversation_add_participants_body.status.intValue();
            }
            if (fromValue == IMCMD.REMOVE_CONVERSATION_PARTICIPANTS) {
                return this.f47482f.body.conversation_remove_participants_body.status.intValue();
            }
            if (fromValue == IMCMD.UPDATE_CONVERSATION_PARTICIPANT) {
                return this.f47482f.body.update_conversation_participant_body.status.intValue();
            }
            if (fromValue == IMCMD.SET_CONVERSATION_CORE_INFO) {
                return this.f47482f.body.set_conversation_core_info_body.status.intValue();
            }
            if (fromValue == IMCMD.UPSERT_CONVERSATION_CORE_EXT_INFO) {
                return this.f47482f.body.upsert_conversation_core_ext_info_body.status.intValue();
            }
            if (fromValue == IMCMD.SET_CONVERSATION_SETTING_INFO) {
                return this.f47482f.body.set_conversation_setting_info_body.status.intValue();
            }
            if (fromValue == IMCMD.UPSERT_CONVERSATION_SETTING_EXT_INFO) {
                return this.f47482f.body.upsert_conversation_setting_ext_info_body.status.intValue();
            }
            if (fromValue == IMCMD.UPDATE_CONVERSATION_AUDIT_SWITCH) {
                Integer num2 = (Integer) m37687a("status", this.f47482f.body.getExtension(IMCMD.UPDATE_CONVERSATION_AUDIT_SWITCH.getValue()));
                if (num2 != null) {
                    return num2.intValue();
                }
            } else if (fromValue == IMCMD.SEND_CONVERSATION_APPLY) {
                Integer num3 = (Integer) m37687a("status", this.f47482f.body.getExtension(IMCMD.SEND_CONVERSATION_APPLY.getValue()));
                if (num3 != null) {
                    return num3.intValue();
                }
            } else if (fromValue == IMCMD.ACK_CONVERSATION_APPLY) {
                Integer num4 = (Integer) m37687a("status", this.f47482f.body.getExtension(IMCMD.ACK_CONVERSATION_APPLY.getValue()));
                if (num4 != null) {
                    return num4.intValue();
                }
            } else if (fromValue == IMCMD.CALL_VOIP) {
                Integer num5 = (Integer) m37687a("status", this.f47482f.body.getExtension(IMCMD.CALL_VOIP.getValue()));
                if (num5 != null) {
                    return num5.intValue();
                }
            } else if (fromValue == IMCMD.BROADCAST_SEND_MESSAGE) {
                Integer num6 = (Integer) m37687a("status", this.f47482f.body.getExtension(IMCMD.BROADCAST_SEND_MESSAGE.getValue()));
                if (num6 != null) {
                    return num6.intValue();
                }
            } else if (fromValue == IMCMD.PREVIEWER_GET_CONVERSATION_INFO_LIST) {
                return this.f47482f.body.previewer_get_conversation_info_list_body.status.intValue();
            } else {
                if (fromValue == IMCMD.PREVIEWER_GET_MESSAGES_BY_CONVERSATION) {
                    return this.f47482f.body.previewer_messages_in_conversation_body.status.intValue();
                }
                if (fromValue == IMCMD.SEND_FRIEND_APPLY && (num = (Integer) m37687a("status", this.f47482f.body.getExtension(IMCMD.SEND_FRIEND_APPLY.getValue()))) != null) {
                    return num.intValue();
                }
            }
            return C19489e.AbstractC19491b.f46184a;
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.p1399im.core.internal.p1431d.AbstractC19968d
    /* renamed from: d */
    public final long mo31855d() {
        Long l;
        try {
            IMCMD fromValue = IMCMD.fromValue(this.f47481e.cmd.intValue());
            if (fromValue == null) {
                return -1000;
            }
            if (fromValue == IMCMD.SEND_MESSAGE) {
                return this.f47482f.body.send_message_body.check_code.longValue();
            }
            if (fromValue == IMCMD.CREATE_CONVERSATION_V2) {
                return this.f47482f.body.create_conversation_v2_body.check_code.longValue();
            }
            if (fromValue == IMCMD.ADD_CONVERSATION_PARTICIPANTS) {
                return this.f47482f.body.conversation_add_participants_body.check_code.longValue();
            }
            if (fromValue == IMCMD.REMOVE_CONVERSATION_PARTICIPANTS) {
                return this.f47482f.body.conversation_remove_participants_body.check_code.longValue();
            }
            if (fromValue == IMCMD.UPDATE_CONVERSATION_PARTICIPANT) {
                return this.f47482f.body.update_conversation_participant_body.check_code.longValue();
            }
            if (fromValue == IMCMD.SET_CONVERSATION_CORE_INFO) {
                return this.f47482f.body.set_conversation_core_info_body.check_code.longValue();
            }
            if (fromValue == IMCMD.UPSERT_CONVERSATION_CORE_EXT_INFO) {
                return this.f47482f.body.upsert_conversation_core_ext_info_body.check_code.longValue();
            }
            if (fromValue == IMCMD.SET_CONVERSATION_SETTING_INFO) {
                return this.f47482f.body.set_conversation_setting_info_body.check_code.longValue();
            }
            if (fromValue == IMCMD.UPSERT_CONVERSATION_SETTING_EXT_INFO) {
                return this.f47482f.body.upsert_conversation_setting_ext_info_body.check_code.longValue();
            }
            if (fromValue == IMCMD.UPDATE_CONVERSATION_AUDIT_SWITCH) {
                Long l2 = (Long) m37687a("check_code", this.f47482f.body.getExtension(IMCMD.UPDATE_CONVERSATION_AUDIT_SWITCH.getValue()));
                if (l2 != null) {
                    return l2.longValue();
                }
                return 0;
            } else if (fromValue == IMCMD.SEND_CONVERSATION_APPLY) {
                Long l3 = (Long) m37687a("check_code", this.f47482f.body.getExtension(IMCMD.SEND_CONVERSATION_APPLY.getValue()));
                if (l3 != null) {
                    return l3.longValue();
                }
                return 0;
            } else if (fromValue == IMCMD.ACK_CONVERSATION_APPLY) {
                Long l4 = (Long) m37687a("check_code", this.f47482f.body.getExtension(IMCMD.ACK_CONVERSATION_APPLY.getValue()));
                if (l4 != null) {
                    return l4.longValue();
                }
                return 0;
            } else if (fromValue == IMCMD.CALL_VOIP) {
                Long l5 = (Long) m37687a("check_code", this.f47482f.body.getExtension(IMCMD.CALL_VOIP.getValue()));
                if (l5 != null) {
                    return l5.longValue();
                }
                return 0;
            } else if (fromValue == IMCMD.BROADCAST_SEND_MESSAGE) {
                Long l6 = (Long) m37687a("check_code", this.f47482f.body.getExtension(IMCMD.BROADCAST_SEND_MESSAGE.getValue()));
                if (l6 != null) {
                    return l6.longValue();
                }
                return 0;
            } else if (fromValue == IMCMD.PREVIEWER_GET_CONVERSATION_INFO_LIST) {
                return this.f47482f.body.previewer_get_conversation_info_list_body.check_code.longValue();
            } else {
                if (fromValue == IMCMD.PREVIEWER_GET_MESSAGES_BY_CONVERSATION) {
                    return this.f47482f.body.previewer_messages_in_conversation_body.check_code.longValue();
                }
                if (fromValue != IMCMD.SEND_FRIEND_APPLY || (l = (Long) m37687a("check_code", this.f47482f.body.getExtension(IMCMD.SEND_FRIEND_APPLY.getValue()))) == null) {
                    return 0;
                }
                return l.longValue();
            }
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // com.bytedance.p1399im.core.internal.p1431d.AbstractC19968d
    /* renamed from: e */
    public final String mo31856e() {
        String str;
        try {
            IMCMD fromValue = IMCMD.fromValue(this.f47481e.cmd.intValue());
            if (fromValue == null) {
                return "";
            }
            if (fromValue == IMCMD.SEND_MESSAGE) {
                return this.f47482f.body.send_message_body.check_message;
            }
            if (fromValue == IMCMD.CREATE_CONVERSATION_V2) {
                return this.f47482f.body.create_conversation_v2_body.check_message;
            }
            if (fromValue == IMCMD.ADD_CONVERSATION_PARTICIPANTS) {
                return this.f47482f.body.conversation_add_participants_body.check_message;
            }
            if (fromValue == IMCMD.REMOVE_CONVERSATION_PARTICIPANTS) {
                return this.f47482f.body.conversation_remove_participants_body.check_message;
            }
            if (fromValue == IMCMD.UPDATE_CONVERSATION_PARTICIPANT) {
                return this.f47482f.body.update_conversation_participant_body.check_message;
            }
            if (fromValue == IMCMD.SET_CONVERSATION_CORE_INFO) {
                return this.f47482f.body.set_conversation_core_info_body.check_message;
            }
            if (fromValue == IMCMD.UPSERT_CONVERSATION_CORE_EXT_INFO) {
                return this.f47482f.body.upsert_conversation_core_ext_info_body.check_message;
            }
            if (fromValue == IMCMD.SET_CONVERSATION_SETTING_INFO) {
                return this.f47482f.body.set_conversation_setting_info_body.check_message;
            }
            if (fromValue == IMCMD.UPSERT_CONVERSATION_SETTING_EXT_INFO) {
                return this.f47482f.body.upsert_conversation_setting_ext_info_body.check_message;
            }
            if (fromValue == IMCMD.UPDATE_CONVERSATION_AUDIT_SWITCH) {
                String str2 = (String) m37687a("check_message", this.f47482f.body.getExtension(IMCMD.UPDATE_CONVERSATION_AUDIT_SWITCH.getValue()));
                if (str2 != null) {
                    return str2;
                }
            } else if (fromValue == IMCMD.SEND_CONVERSATION_APPLY) {
                String str3 = (String) m37687a("check_message", this.f47482f.body.getExtension(IMCMD.SEND_CONVERSATION_APPLY.getValue()));
                if (str3 != null) {
                    return str3;
                }
            } else if (fromValue == IMCMD.ACK_CONVERSATION_APPLY) {
                String str4 = (String) m37687a("check_message", this.f47482f.body.getExtension(IMCMD.ACK_CONVERSATION_APPLY.getValue()));
                if (str4 != null) {
                    return str4;
                }
            } else if (fromValue == IMCMD.CALL_VOIP) {
                String str5 = (String) m37687a("check_message", this.f47482f.body.getExtension(IMCMD.CALL_VOIP.getValue()));
                if (str5 != null) {
                    return str5;
                }
            } else if (fromValue == IMCMD.BROADCAST_SEND_MESSAGE) {
                String str6 = (String) m37687a("check_message", this.f47482f.body.getExtension(IMCMD.BROADCAST_SEND_MESSAGE.getValue()));
                if (str6 != null) {
                    return str6;
                }
            } else if (fromValue == IMCMD.PREVIEWER_GET_CONVERSATION_INFO_LIST) {
                return this.f47482f.body.previewer_get_conversation_info_list_body.check_message;
            } else {
                if (fromValue == IMCMD.PREVIEWER_GET_MESSAGES_BY_CONVERSATION) {
                    return this.f47482f.body.previewer_messages_in_conversation_body.check_message;
                }
                if (fromValue != IMCMD.SEND_FRIEND_APPLY || (str = (String) m37687a("check_message", this.f47482f.body.getExtension(IMCMD.SEND_FRIEND_APPLY.getValue()))) == null) {
                    return "";
                }
                return str;
            }
            return "";
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static C19978k m37686a(int i) {
        C19978k kVar = new C19978k(-1, null);
        kVar.f47485i = i;
        kVar.f47479c = null;
        return kVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(C19978k kVar) {
        C19978k kVar2 = kVar;
        if (equals(kVar2)) {
            return 0;
        }
        int k = mo31868k();
        if (k != kVar2.mo31868k()) {
            if (k == IMCMD.SEND_MESSAGE.getValue()) {
                return -1;
            }
            if (kVar2.mo31868k() == IMCMD.SEND_MESSAGE.getValue()) {
                return 1;
            }
        }
        long j = this.f47477a;
        long j2 = kVar2.f47477a;
        if (j - j2 > 0) {
            return 1;
        }
        if (j - j2 < 0) {
            return -1;
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo31863a(Response response) {
        int i;
        this.f47482f = response;
        if (response != null) {
            if (response.status_code != null) {
                i = response.status_code.intValue();
            } else {
                i = C19489e.AbstractC19491b.f46190g;
            }
            this.f47485i = i;
        }
    }

    public C19978k(long j, AbstractC19927w wVar) {
        this.f47477a = j;
        this.f47484h = wVar;
    }

    /* renamed from: a */
    private static Object m37687a(String str, Object obj) {
        try {
            Field declaredField = obj.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            if (obj2 != null) {
                return obj2;
            }
            return null;
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
            return null;
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public final void mo31862a(int i, String str) {
        if (this.f47481e != null) {
            this.f47482f = new Response.Builder().cmd(this.f47481e.cmd).inbox_type(this.f47481e.inbox_type).error_desc(str).sequence_id(Long.valueOf(this.f47477a)).status_code(Integer.valueOf(i)).build();
            this.f47485i = i;
        }
    }
}
