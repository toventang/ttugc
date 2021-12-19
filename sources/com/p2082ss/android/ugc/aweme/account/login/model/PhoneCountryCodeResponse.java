package com.p2082ss.android.ugc.aweme.account.login.model;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.model.PhoneCountryCodeResponse */
public final class PhoneCountryCodeResponse {
    private final HashMap<String, List<PhoneCountryData>> map;

    static {
        Covode.recordClassIndex(38714);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.account.login.model.PhoneCountryCodeResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PhoneCountryCodeResponse copy$default(PhoneCountryCodeResponse phoneCountryCodeResponse, HashMap hashMap, int i, Object obj) {
        if ((i & 1) != 0) {
            hashMap = phoneCountryCodeResponse.map;
        }
        return phoneCountryCodeResponse.copy(hashMap);
    }

    public final HashMap<String, List<PhoneCountryData>> component1() {
        return this.map;
    }

    public final PhoneCountryCodeResponse copy(HashMap<String, List<PhoneCountryData>> hashMap) {
        return new PhoneCountryCodeResponse(hashMap);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof PhoneCountryCodeResponse) && C89219l.m154714a(this.map, ((PhoneCountryCodeResponse) obj).map);
        }
        return true;
    }

    public final int hashCode() {
        HashMap<String, List<PhoneCountryData>> hashMap = this.map;
        if (hashMap != null) {
            return hashMap.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "PhoneCountryCodeResponse(map=" + this.map + ")";
    }

    public final HashMap<String, List<PhoneCountryData>> getMap() {
        return this.map;
    }

    public PhoneCountryCodeResponse(HashMap<String, List<PhoneCountryData>> hashMap) {
        this.map = hashMap;
    }
}
