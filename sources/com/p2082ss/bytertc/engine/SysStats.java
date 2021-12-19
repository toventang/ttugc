package com.p2082ss.bytertc.engine;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bytertc.engine.SysStats */
public class SysStats {
    public double cpu_app_usage;
    public int cpu_cores;
    public double cpu_total_usage;
    public long free_memory;
    public long full_memory;
    public double memory_ratio;
    public double memory_usage;
    public double total_memory_ratio;
    public long total_memory_usage;

    static {
        Covode.recordClassIndex(100942);
    }

    public SysStats() {
    }

    public String toString() {
        return "SysStats{cpu_cores=" + this.cpu_cores + '\'' + " cpu_app_usage=" + this.cpu_app_usage + '\'' + ", cpu_total_usage=" + this.cpu_total_usage + ", memory_usage=" + this.memory_usage + "full_memory=" + this.full_memory + '\'' + "total_memory_usage=" + this.total_memory_usage + '\'' + "free_memory=" + this.free_memory + '\'' + "memory_ratio=" + this.memory_ratio + '\'' + "total_memory_ratio=" + this.total_memory_ratio + '}';
    }

    private static SysStats create(int i, double d, double d2, double d3, long j, long j2, long j3, double d4, double d5) {
        return new SysStats(i, d, d2, d3, j, j2, j3, d4, d5);
    }

    public SysStats(int i, double d, double d2, double d3, long j, long j2, long j3, double d4, double d5) {
        this.cpu_cores = i;
        this.cpu_app_usage = d;
        this.cpu_total_usage = d2;
        this.memory_usage = d3;
        this.full_memory = j;
        this.total_memory_usage = j2;
        this.free_memory = j3;
        this.memory_ratio = d4;
        this.total_memory_ratio = d5;
    }
}
