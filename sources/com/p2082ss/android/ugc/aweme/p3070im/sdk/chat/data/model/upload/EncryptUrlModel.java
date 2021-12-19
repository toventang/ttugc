package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.upload;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55076b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55221p;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56256i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.upload.EncryptUrlModel */
public class EncryptUrlModel extends UrlModel {
    @AbstractC27891c(mo46611a = "md5")
    String md5;
    @AbstractC27891c(mo46611a = "oid")
    String oid;
    @AbstractC27891c(mo46611a = "skey")
    String skey;

    static {
        Covode.recordClassIndex(63494);
    }

    public String getMd5() {
        return this.md5;
    }

    public String getOid() {
        return this.oid;
    }

    public String getSkey() {
        return this.skey;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public void setOid(String str) {
        this.oid = str;
    }

    public void setSkey(String str) {
        this.skey = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.model.UrlModel
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EncryptUrlModel)) {
            return false;
        }
        EncryptUrlModel encryptUrlModel = (EncryptUrlModel) obj;
        if (!TextUtils.equals(this.oid, encryptUrlModel.oid) || !TextUtils.equals(this.skey, encryptUrlModel.skey) || !TextUtils.equals(this.md5, encryptUrlModel.md5)) {
            return false;
        }
        return true;
    }

    public static UrlModel convert(EncryptUrlModel encryptUrlModel) {
        C55221p.C55222a.C55223a aVar;
        String str = null;
        if (encryptUrlModel == null) {
            return null;
        }
        UrlModel urlModel = new UrlModel();
        String str2 = encryptUrlModel.oid;
        String str3 = encryptUrlModel.skey;
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C56256i iMSetting = C55076b.m100723b().getIMSetting();
        C89219l.m154716b(iMSetting, "");
        List<String> list = iMSetting.f128313e;
        if (list == null || list.size() <= 0) {
            String[] strArr = C55221p.f126300a;
            aVar = new C55221p.C55222a.C55223a(C89070n.m154522b(Arrays.copyOf(strArr, strArr.length)), str2, str3);
        } else {
            if (list.size() < 3) {
                int size = 3 - list.size();
                int i = 0;
                while (i < C55221p.f126300a.length && i < size) {
                    list.add(C55221p.f126300a[i]);
                    i++;
                }
            }
            aVar = new C55221p.C55222a.C55223a(list, str2, str3);
        }
        ArrayList arrayList = new ArrayList();
        String a = aVar.mo92218a();
        if (aVar.f126307a != null) {
            List<String> list2 = aVar.f126307a;
            if (list2 == null) {
                C89219l.m154715b();
            }
            if (list2.size() > 0) {
                List<String> list3 = aVar.f126307a;
                if (list3 == null) {
                    C89219l.m154715b();
                }
                int size2 = list3.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    StringBuilder sb = new StringBuilder();
                    List<String> list4 = aVar.f126307a;
                    if (list4 == null) {
                        C89219l.m154715b();
                    }
                    arrayList.add(sb.append(list4.get(i2)).append(a).toString());
                }
            }
        }
        urlModel.setUrlList(arrayList);
        String a2 = aVar.mo92218a();
        if (aVar.f126307a != null) {
            List<String> list5 = aVar.f126307a;
            if (list5 == null) {
                C89219l.m154715b();
            }
            if (list5.size() > 0) {
                StringBuilder sb2 = new StringBuilder();
                List<String> list6 = aVar.f126307a;
                if (list6 == null) {
                    C89219l.m154715b();
                }
                str = sb2.append(list6.get(0)).append(a2).toString();
            }
        }
        urlModel.setUri(str);
        return urlModel;
    }
}
