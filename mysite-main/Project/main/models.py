from django.db import models

# Create your models here.

class News(models.Model):
     title = models.CharField('Названия', max_length=80)
     name = models.CharField('Name',max_length=80, blank=False)
     surname = models.CharField('Surname',max_length=80, blank=False)
     news=models.TextField('Описания',blank=False)
     is_published = models.BooleanField(default=True)
     id = models.IntegerField( unique=True, db_index=True, verbose_name="URL",primary_key=True)
     time_create = models.DateTimeField(auto_now_add=True)
     def __str__(self):
         return self.title


