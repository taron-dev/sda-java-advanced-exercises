package sk.taron.sda.examples;

import java.util.Collection;

public interface StorageManager {
  void addToStorage(String key, String value);
  void printValues(String key);
  Collection<String> findValues(String value);
}
