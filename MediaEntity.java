package org.example;

public interface MediaEntity {
   public String getName();

   public static int compareAlphabetically(MediaEntity entity1, MediaEntity entity2) {
      return entity1.getName().compareTo(entity2.getName());
   }
}

