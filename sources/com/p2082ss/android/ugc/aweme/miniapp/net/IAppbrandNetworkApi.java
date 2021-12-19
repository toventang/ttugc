package com.p2082ss.android.ugc.aweme.miniapp.net;

import com.bytedance.covode.number.Covode;
import com.bytedance.p951d.p952a.p953a.p954a.p955a.C14420a;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p1610b.AbstractC21984a;
import com.bytedance.retrofit2.p1610b.AbstractC21987aa;
import com.bytedance.retrofit2.p1610b.AbstractC21991ae;
import com.bytedance.retrofit2.p1610b.AbstractC21993ag;
import com.bytedance.retrofit2.p1610b.AbstractC21994b;
import com.bytedance.retrofit2.p1610b.AbstractC21996d;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22001i;
import com.bytedance.retrofit2.p1610b.AbstractC22002j;
import com.bytedance.retrofit2.p1610b.AbstractC22004l;
import com.bytedance.retrofit2.p1610b.AbstractC22007o;
import com.bytedance.retrofit2.p1610b.AbstractC22010r;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22013u;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.miniapp.net.IAppbrandNetworkApi */
public interface IAppbrandNetworkApi {
    static {
        Covode.recordClassIndex(69661);
    }

    @AbstractC22002j(mo35791a = C14420a.f34884d, mo35793c = true)
    @AbstractC21991ae
    AbstractC21983b<TypedInput> delete(@AbstractC22007o int i, @AbstractC21993ag String str, @AbstractC21987aa(mo35781a = true) Map<String, String> map, @AbstractC21994b TypedOutput typedOutput, @AbstractC22004l List<C22027b> list, @AbstractC21996d Object obj, @AbstractC21984a boolean z);

    @AbstractC22000h
    @AbstractC21991ae
    AbstractC21983b<TypedInput> getRaw(@AbstractC21984a boolean z, @AbstractC22007o int i, @AbstractC21993ag String str, @AbstractC21987aa(mo35781a = true) Map<String, String> map, @AbstractC22004l List<C22027b> list, @AbstractC21996d Object obj, @AbstractC21984a boolean z2);

    @AbstractC21991ae
    @AbstractC22001i
    AbstractC21983b<TypedInput> head(@AbstractC22007o int i, @AbstractC21993ag String str, @AbstractC21987aa(mo35781a = true) Map<String, String> map, @AbstractC21994b TypedOutput typedOutput, @AbstractC22004l List<C22027b> list, @AbstractC21996d Object obj, @AbstractC21984a boolean z);

    @AbstractC22010r
    @AbstractC21991ae
    AbstractC21983b<TypedInput> options(@AbstractC22007o int i, @AbstractC21993ag String str, @AbstractC21987aa(mo35781a = true) Map<String, String> map, @AbstractC21994b TypedOutput typedOutput, @AbstractC22004l List<C22027b> list, @AbstractC21996d Object obj, @AbstractC21984a boolean z);

    @AbstractC22012t
    @AbstractC21991ae
    AbstractC21983b<TypedInput> post(@AbstractC22007o int i, @AbstractC21993ag String str, @AbstractC21987aa(mo35781a = true) Map<String, String> map, @AbstractC21994b TypedOutput typedOutput, @AbstractC22004l List<C22027b> list, @AbstractC21996d Object obj, @AbstractC21984a boolean z);

    @AbstractC22012t
    AbstractC21983b<String> postBody(@AbstractC22007o int i, @AbstractC21993ag String str, @AbstractC21987aa(mo35781a = true) Map<String, String> map, @AbstractC21994b TypedOutput typedOutput, @AbstractC22004l List<C22027b> list, @AbstractC21996d Object obj);

    @AbstractC21991ae
    @AbstractC22013u
    AbstractC21983b<TypedInput> put(@AbstractC22007o int i, @AbstractC21993ag String str, @AbstractC21987aa(mo35781a = true) Map<String, String> map, @AbstractC21994b TypedOutput typedOutput, @AbstractC22004l List<C22027b> list, @AbstractC21996d Object obj, @AbstractC21984a boolean z);
}
