package com.google.common.hash.example.bloomfilter;

import com.google.common.base.Charsets;
import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;

public class BloomFilterExample {

  public static void main(String[] args) {
    BloomFilter<String> bloomFilter = BloomFilter.create(
        Funnels.stringFunnel(Charsets.UTF_8),
        500,
        0.01);

    bloomFilter.put("hello");
    bloomFilter.put("world");

    System.out.println(bloomFilter.mightContain("hello"));
    System.out.println(bloomFilter.mightContain("world"));
    System.out.println(bloomFilter.mightContain("hello world"));
  }
}
