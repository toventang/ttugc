package com.p2082ss.android.ugc.aweme.profile.presenter;

import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.profile.UserResponse;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.ae */
public class C63828ae implements WeakHandler.IHandler, AbstractC63859w {

    /* renamed from: a */
    public boolean f144690a;

    /* renamed from: b */
    public WeakHandler f144691b;

    /* renamed from: c */
    public AbstractC63860x f144692c;

    /* renamed from: d */
    public int f144693d;

    /* renamed from: e */
    private boolean f144694e;

    /* renamed from: f */
    private boolean f144695f;

    /* renamed from: g */
    private boolean f144696g;

    /* renamed from: h */
    private boolean f144697h;

    /* renamed from: i */
    private boolean f144698i;

    /* renamed from: j */
    private boolean f144699j;

    /* renamed from: k */
    private boolean f144700k;

    /* renamed from: l */
    private boolean f144701l;

    /* renamed from: m */
    private boolean f144702m;

    /* renamed from: n */
    private boolean f144703n;

    /* renamed from: o */
    private boolean f144704o;

    /* renamed from: p */
    private boolean f144705p;

    static {
        Covode.recordClassIndex(75252);
    }

    public C63828ae() {
        this((byte) 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63859w
    /* renamed from: a */
    public final void mo103291a() {
        if (!this.f144703n) {
            this.f144703n = true;
            C31575b.m65865g().updateSecret(this.f144691b, true, this.f144693d, false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63859w
    /* renamed from: a */
    public final void mo103292a(AbstractC63860x xVar) {
        this.f144692c = xVar;
    }

    /* renamed from: b */
    public final void mo103295b(String str) {
        if (!this.f144696g) {
            this.f144696g = true;
            C31575b.m65865g().updateNickName(this.f144691b, str, this.f144693d);
        }
    }

    /* renamed from: c */
    public final void mo103296c(String str) {
        if (!this.f144697h) {
            this.f144697h = true;
            C31575b.m65865g().updateSignature(this.f144691b, str, this.f144693d);
        }
    }

    /* renamed from: d */
    public final void mo103297d(String str) {
        if (!this.f144699j) {
            this.f144699j = true;
            C31575b.m65865g().updateAvatarUri(this.f144691b, str, this.f144693d);
        }
    }

    private C63828ae(byte b) {
        this.f144693d = 0;
        this.f144694e = false;
        this.f144695f = false;
        this.f144696g = false;
        this.f144697h = false;
        this.f144690a = false;
        this.f144698i = false;
        this.f144699j = false;
        this.f144700k = false;
        this.f144701l = false;
        this.f144703n = false;
        this.f144704o = false;
        this.f144705p = false;
        this.f144691b = new WeakHandler(this);
    }

    /* renamed from: a */
    public final void mo103293a(String str) {
        if (!this.f144702m) {
            this.f144702m = true;
            C31575b.m65865g().updateId(this.f144691b, str, this.f144693d);
        }
    }

    /* renamed from: a */
    public final void mo103294a(Map<String, String> map) {
        if (map != null && map.size() != 0 && !this.f144694e) {
            this.f144694e = true;
            map.put("page_from", String.valueOf(this.f144693d));
            C31575b.m65865g().updateUserInfo(this.f144691b, map);
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (message.obj instanceof Exception) {
            m115485a((Exception) message.obj, message.what);
        } else if (message.obj instanceof User) {
            m115484a((User) message.obj, message.what);
        } else if (message.obj instanceof UserResponse) {
            UserResponse userResponse = (UserResponse) message.obj;
            if (userResponse.getAction() == 1) {
                m115486a(userResponse.status_msg, true);
                m115485a((Exception) null, message.what);
            } else if (userResponse.getAction() == 2) {
                m115486a(userResponse.status_msg, false);
                m115485a((Exception) null, message.what);
            } else {
                m115484a(userResponse.getUser(), message.what);
            }
        }
    }

    /* renamed from: a */
    private void m115486a(String str, boolean z) {
        this.f144694e = false;
        this.f144696g = false;
        AbstractC63860x xVar = this.f144692c;
        if (xVar != null) {
            xVar.mo61025a(str, z);
        }
    }

    /* renamed from: a */
    private void m115485a(Exception exc, int i) {
        if (i == 0) {
            this.f144696g = false;
        } else if (i == 112) {
            this.f144694e = false;
        } else if (i == 116) {
            this.f144702m = false;
        } else if (i == 122) {
            this.f144703n = false;
        } else if (i == 2) {
            this.f144697h = false;
        } else if (i == 3) {
            this.f144695f = false;
        } else if (i == 4) {
            this.f144699j = false;
        } else if (i != 5) {
            switch (i) {
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    this.f144704o = false;
                    break;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    this.f144705p = false;
                    break;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    this.f144700k = false;
                    break;
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                    this.f144690a = false;
                    break;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                    this.f144698i = false;
                    break;
            }
        } else {
            this.f144701l = false;
        }
        AbstractC63860x xVar = this.f144692c;
        if (xVar != null && exc != null) {
            xVar.mo61024a(exc, i);
            if (!this.f144699j && !this.f144695f && !this.f144696g && !this.f144697h && !this.f144690a && !this.f144698i && !this.f144702m && !this.f144694e && !this.f144703n && !this.f144700k) {
                this.f144692c.mo61026a(false);
            }
        }
    }

    /* renamed from: a */
    private void m115484a(User user, int i) {
        if (user != null) {
            if (i == 0) {
                this.f144696g = false;
                C31575b.m65865g().updateCurNickname(user.getNickname());
            } else if (i == 2) {
                this.f144697h = false;
                C31575b.m65865g().updateCurSignature(user.getSignature());
            } else if (i == 112) {
                UrlModel avatarVideoUri = user.getAvatarVideoUri();
                if (!(avatarVideoUri == null || avatarVideoUri.getUrlList() == null || avatarVideoUri.getUrlList().size() <= 0)) {
                    C31575b.m65865g().getCurUser().setAvatarUpdateReminder(false);
                }
                this.f144694e = false;
                C31575b.m65865g().updateCurUser(user);
            } else if (i == 116) {
                C63829af.m115494a();
                this.f144702m = false;
                C31575b.m65865g().updateCurUserId(user.getUniqueId());
            } else if (i == 122) {
                this.f144703n = false;
                C31575b.m65865g().updateCurSecret(user.isSecret());
            } else if (i == 4) {
                C31575b.m65865g().getCurUser().setAvatarUpdateReminder(false);
                this.f144699j = false;
                C31575b.m65865g().updateCurAvatar(user.getAvatarThumb(), user.getAvatarMedium(), user.getAvatarLarger());
            } else if (i != 5) {
                switch (i) {
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                        this.f144704o = false;
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                        this.f144705p = false;
                        break;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                        this.f144700k = false;
                        C31575b.m65865g().updateCurCover(user.getCoverUrls());
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                        this.f144700k = false;
                        C31575b.m65865g().updateCurVideoCover(user.getVideoCover());
                        break;
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                        this.f144690a = false;
                        C31575b.m65865g().updateCurSupportedNgo(user.getProfileNgoStruct());
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                        this.f144698i = false;
                        C31575b.m65865g().updateCurSupportedNgo(user.getProfileNgoStruct());
                        break;
                }
            } else {
                this.f144701l = false;
                C31575b.m65865g().updateCurAllowStatus(user.getAllowStatus());
            }
            AbstractC63860x xVar = this.f144692c;
            if (xVar != null) {
                xVar.mo61023a(user, i);
                if (!this.f144699j && !this.f144695f && !this.f144696g && !this.f144697h && !this.f144690a && !this.f144702m && !this.f144694e && !this.f144703n && !this.f144700k) {
                    this.f144692c.mo61026a(true);
                }
            }
        }
    }
}
